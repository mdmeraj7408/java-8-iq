package com.java.functionalinterface;

@FunctionalInterface
interface  Squire{
    int calculate(int x);
}
public class New {
    public static void main(String[] args) {

      int a=5;
      Squire s=(int x)->x*x;

        int ans=s.calculate(a);
        System.out.println(ans);
    }
}
