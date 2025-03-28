package com.scoping;

public class ArrayEvenElements {
    public static void main(String [] args)
    {

        int[] arr=new int[]{10,20,30,40,50};
        for(int i=0;i<arr.length;i+=2)
        {
            System.out.println(arr[i]);
        }
        //print sum
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
           sum+=arr[i];
        }
        System.out.println("sum: "+sum);
    }
}
