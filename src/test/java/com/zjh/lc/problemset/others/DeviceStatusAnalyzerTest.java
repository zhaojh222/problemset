package com.zjh.lc.problemset.others;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeviceStatusAnalyzerTest {

    private DeviceStatusAnalyzer deviceStatusAnalyzer = new DeviceStatusAnalyzer();

    @Test
    void loadDeviceStatus() throws IOException {
        File logFile = new File("/home/zjh/files/log.txt");
        File outputFile = new File("/home/zjh/files/output.txt");
        deviceStatusAnalyzer.analyseLog(logFile, outputFile);
    }
}