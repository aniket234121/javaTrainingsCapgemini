package com.scoping;

import java.util.zip.ZipInputStream;

public class SwitchExpression {
    public static void main(String[] args) {

        int num1=8;
        String str=switch(num1) {
            case 1 -> "1";
            case 2 -> "2";
            case 3 -> "3";
            default -> {
                System.out.println("Please enter a number: ");
                yield "rn";}
        };
        System.out.println(str);

    }
}
