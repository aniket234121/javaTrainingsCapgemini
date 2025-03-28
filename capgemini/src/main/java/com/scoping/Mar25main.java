package com.scoping;

import java.util.Scanner;

public class Mar25main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the values");
        for (int i = 0; i < size; i++) {
            arr[i]=scanner.nextInt();
        }
        int sum=Mar25Q14.sum(arr);
        System.out.println("sum of second Half :"+sum);
    }
}
