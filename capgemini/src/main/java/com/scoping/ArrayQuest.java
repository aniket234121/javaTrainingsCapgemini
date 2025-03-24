package com.scoping;

public class ArrayQuest {
    public static int[] merge(int []arr1,int[]arr2)
    {

        int []arr3=new int[arr1.length+arr2.length];
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            arr3[count++]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr3[count++]=arr2[i];
        }
        return arr3;
    }
    public static void main(String[] args)
    {
        int []arr1={1,2,3};
        int []arr2={4,5,6};
        int []arr3;
        arr3=merge(arr1,arr2);
        System.out.println("third array ");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }
    }
}
