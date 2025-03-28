package com.scoping;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a byte: ");
        byte num5=scanner.nextByte();
        System.out.println("Please enter a short: ");
        short num6=scanner.nextShort();

        System.out.println("Please enter a number: ");
        int num=scanner.nextInt();
        System.out.println("Please enter a float: ");
        float num1=scanner.nextFloat();
        System.out.println("Please enter a double: ");
        double num2=scanner.nextDouble();
        System.out.println("Please enter a Boolean: ");
        boolean num3=scanner.nextBoolean();
        System.out.println("Please enter a long: ");
        long num4=scanner.nextLong();
        System.out.println(num+" "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6);


    }
}
