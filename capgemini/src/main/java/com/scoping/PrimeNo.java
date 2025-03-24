package com.scoping;

import java.util.Scanner;

public class PrimeNo {
    public static void primeNo(int num) {
        int temp=num;

        int count=0;
        while(temp!=0) {
            if(num%temp==0) {
                count++;
            }
            temp--;
        }
        if(count<=2)
            System.out.println(num+" prime no.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the low:");

        int low=sc.nextInt();
        System.out.println("enter the high:");
        int high=sc.nextInt();
        for(int i=low;i<=high;i++) {
            primeNo(i);
        }
    }
}
