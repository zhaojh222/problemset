package com.zjh.lc.problemset.easy;

import com.google.common.collect.ImmutableList;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombination {

    private List<String> letters;
    private List<String> results;
    private int startIndex = 1;

    public LetterCombination() {
        //"0 - "9"
        letters = ImmutableList.of("", "","abc","def","ghi","jkl","mno",
            "pqrs","tuv","wxyz");
        results = new ArrayList<>();
    }

    private void combine(String value,List<String> subList) {
        int size = subList.size();
        String chars = subList.get(0);
        if (size > 1) {
            for (char c : chars.toCharArray()) {
                combine(value + c, subList.subList(startIndex, size));
            }
        } else {
            for (char c : chars.toCharArray()) {
                String finalValue = value + c;
                results.add(finalValue);
            }
        }
    }

    public List<String> combineNumbers(String strNumber) {
        if (StringUtils.isEmpty(strNumber)) {
            return new ArrayList<>();
        }
        List<String> subLetters = new ArrayList<>();
        String[] nums = strNumber.split("");
        for(String num : nums) {
            subLetters.add(letters.get(Integer.valueOf(num) - 1));
        }
        combine("",subLetters);
        return results;
    }

    public List<String> getResults() {
        return results;
    }
}
