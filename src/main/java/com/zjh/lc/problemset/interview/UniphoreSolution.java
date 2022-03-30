package com.zjh.lc.problemset.interview;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UniphoreSolution {

    private int size;
    private int capacity;

    //To check the data is duplicated
    private Set<String> set;
    //To store the data
    private List<String> list;

    public UniphoreSolution(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        set = new HashSet();
        list = new LinkedList();
    }

    public void addUrl(String url) {
        if (size < capacity) {
            if (!set.contains(url)) {
                set.add(url);
                list.add(url);
            } else {
                list.remove(url);
                list.add(url);
            }
        } else {
            if (!set.contains(url)) {
                String eldestUrl = list.get(0);
                set.remove(eldestUrl);
                set.add(url);
                list.remove(eldestUrl);
                list.add(url);
            } else {
                list.remove(url);
                list.add(url);
            }
        }
    }

    public void printUrls() {
        list.forEach(System.out::println);
    }
}
