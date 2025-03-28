package com.scoping;

import java.util.Scanner;

public class Mar25Q14 {
    public static int sum(int []arr)
    {
        int sum=0;
        for(int i=arr.length/2;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }

}
