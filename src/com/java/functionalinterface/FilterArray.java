package com.java.functionalinterface;

public class FilterArray {
    public static void main(String[] args) {
        String in="Hello@World#2025!";
        char[] charArray = in.toCharArray();
        StringBuilder sb=new StringBuilder();

        for(char c:charArray){
          if(Character.isLetterOrDigit(c)){
              sb.append(c);
          }

        }
        System.out.println(sb.toString());
    }
}
