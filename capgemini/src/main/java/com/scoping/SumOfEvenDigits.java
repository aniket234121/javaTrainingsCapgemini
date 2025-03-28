package com.scoping;

import java.util.Scanner;

public class SumOfEvenDigits {
    public static int sumOfNumbers(int n) {
        int sum=0;
        if((int)Math.log10(n)+1==1) return sum;
        if(  ( (int)Math.log10(n)+1 )%2!=0  ) n/=10;
        while(n!=0)
        {
            sum+=n%10;
            n/=100;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to print sum of even digits of that numbers");
        System.out.println(sumOfNumbers(sc.nextInt()));
    }
}
