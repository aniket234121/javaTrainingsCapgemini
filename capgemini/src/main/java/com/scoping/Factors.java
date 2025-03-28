package com.scoping;

public class Factors {
    public static void factors(int num) {
        int temp=num;
        while(temp!=0) {
            if (num%temp==0) {
                System.out.print(temp+" ");
            }
            temp--;
        }
    }
    public static void main(String[] args) {
        factors(12);
    }
}
