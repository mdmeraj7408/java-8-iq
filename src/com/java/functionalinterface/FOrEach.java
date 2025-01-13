package com.java.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class FOrEach {
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(1,2,5,4,7,8,6);
        number.forEach(numbers -> System.out.println(number));
    }
}
