package com.java.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FIndStartWith {
    public static  void filter(List<String> names, Predicate<String> conditition  ){
        for(String name:names){
            if (conditition.test(name)){

                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter First Char Of your word: ");
        String charect=sc.next();
        List<String> name= Arrays.asList("Meraj Alam","Alsma","Rizwan","Amir","Zubair");
        filter(name,(str)->str.startsWith(charect));
    }
}
