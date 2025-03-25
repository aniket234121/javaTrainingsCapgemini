package com.scoping;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static int sumOfMainDiag(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void columnSum(int[][] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[j][i];
            }
            System.out.println("column : "+i+" sum : "+sum);
        }

    }
//    merge two sorted array
    public static int[] merge(int []arr,int []arr2)
    {
        int left=0;
        int right=0;
        int counter=0;
        int []res=new int[arr.length+arr2.length];
        while(left<arr.length&& right<arr2.length)
        {
         if(arr[left]<arr2[right])
         {
             res[counter++]=arr[left++];
         }
         else {
             res[counter++]=arr2[right++];
         }
        }
        while(left<arr.length)
        {
            res[counter++]=arr[left++];
        }
        while(right<arr2.length)
        {
            res[counter++]=arr2[right++];
        }
        return res;

    }
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int []arr2={1,2,9};
        int[]arr1={3,7,18,78};
        System.out.println(Arrays.deepToString(arr));
        System.out.println("diagonal sum: "+sumOfMainDiag(arr));
       columnSum(arr);
       System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
}
