package com.java.functionalinterface;


public class FunctionalInterfaceData {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("Start New Thread")).start();

    }
}
