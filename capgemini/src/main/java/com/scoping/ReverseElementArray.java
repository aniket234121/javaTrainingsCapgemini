package com.scoping;

import java.util.Arrays;

public class ReverseElementArray {
    public static int reverse(int num)
    {
        int rev=0;
        while(num!=0)
        {
            rev=rev*10+num%10;
            num/=10;
        }
        return rev;
    }
    public static void ReverseElements(int []arr)
    {
        System.out.println("Array before reversing: "+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=reverse(arr[i]);
        }
        System.out.println("Array after reversing: "+ Arrays.toString(arr));
    }
    public static void main(String[] args) {
        ReverseElements(new int[]{12,23,34});
    }
}
