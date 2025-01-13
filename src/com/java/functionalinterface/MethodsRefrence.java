package com.java.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodsRefrence {
    public static void main(String[] args) {
        List<String> word= Arrays.asList("Java","JavaScript","Python","go","Kotlin");
        List<String> toUpperCase=word.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(toUpperCase);

        //Lower Case
       word.stream()
           .map(String::toLowerCase)
                .toList()
           .forEach(System.out::println);
       // System.out.println(toLowerCase);
    }


}
