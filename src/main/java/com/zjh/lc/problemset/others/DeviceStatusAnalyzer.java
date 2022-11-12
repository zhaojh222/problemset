package com.zjh.lc.problemset.others;

import lombok.Builder;
import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DeviceStatusAnalyzer {

    private final static String REGEX = "^(.+)\\s(.+)\\s(.+)\\s\\->\\s(.+)$";
    private final static String OUT_OF_USE = "OUT_OF_USE";
    private final static String IN_STORAGE = "IN_STORAGE";
    private Pattern pattern = Pattern.compile(REGEX);

    private Map<String, List<DeviceStatus>> deviceStatusMap = new HashMap<>();

    private List<String> allowList = new ArrayList<>();
    private List<String> denyList = new ArrayList<>();

    public void analyseLog(File logFile ,File outputFile) throws IOException {
        deviceStatusMap = Files.readAllLines(Paths.get(logFile.toURI())).stream()
                .filter(line -> line.matches(REGEX))
                .map(this::convertLogToDeviceStatus)
                .collect(Collectors.groupingBy(DeviceStatus::getDsn));
        if(!CollectionUtils.isEmpty(deviceStatusMap)) {
            deviceStatusMap.entrySet().stream().forEach(entry -> {
                DeviceStatus deviceStatus = entry.getValue().stream().max(Comparator.comparing(DeviceStatus::getDatetime)).get();
                if (OUT_OF_USE.equals(deviceStatus.getEnd())) {
                    denyList.add(deviceStatus.getDsn());
                } else if (IN_STORAGE.equals(deviceStatus.getEnd())) {
                    allowList.add(deviceStatus.getDsn());
                }
            });
        }
        outputToFile(outputFile);
    }

    private DeviceStatus convertLogToDeviceStatus(String line) {
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return DeviceStatus.builder()
                    .datetime(matcher.group(1))
                    .dsn(matcher.group(2))
                    .start(matcher.group(3))
                    .end(matcher.group(4))
                    .build();
        }
        return null;
    }

    private void outputToFile(File outputFile) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        writer.write("--------- Output File Starts ------------------------------------\n");
        writer.write("DSNs under DENY LIST:\n");
        for (String dns : denyList) {
            writer.write(dns + "\n");
        }
        writer.write("\n");
        writer.write("DSNs under ALLOW LIST:\n");
        for (String dns : allowList) {
            writer.write(dns + "\n");
        }
        writer.write("--------- Output File Ends --------------------------------------\n");
        writer.flush();
        writer.close();
    }

    @Data
    @Builder
    public static class DeviceStatus {

        private String datetime;
        private String dsn;
        private String start;
        private String end;
    }
}
