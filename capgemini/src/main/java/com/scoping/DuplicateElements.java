package com.scoping;

public class DuplicateElements {
    public static int max(int []arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)max=arr[i];
        }
        return max;
    }
    public static void printDuplicates(int []arr)
    {
        int size=max(arr);
        int count[]=new int[size+1];

        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]>1)System.out.println(i+" : "+count[i]);
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,3,2,5,6};
        printDuplicates(arr);
    }
}
