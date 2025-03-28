package com.scoping;

public class CheckEvenOdd {
    public static String checkCondition(int num)
    {
        return num % 2 == 0 ? "even" : "odd";
    }
    public static void main(String[] args) {
       System.out.println(checkCondition(5));
    }
}
