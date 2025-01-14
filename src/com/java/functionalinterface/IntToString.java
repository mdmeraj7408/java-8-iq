package com.java.functionalinterface;

import java.util.List;

public class IntToString {
    public static void main(String[] args) {
        List<String> strs = List.of("one","two","three");
        List<Integer> ints = List.of(1,2,3);
        System.out.println(ints.getClass() == strs.getClass());
    }
}
