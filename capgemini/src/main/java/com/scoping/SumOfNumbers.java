package com.scoping;

import java.util.Scanner;

public class SumOfNumbers {
    public static int sumOfNumbers(int n) {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to print sum of that numbers");
        System.out.println(sumOfNumbers(sc.nextInt()));
    }
}
