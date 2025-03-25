package com.scoping;

import java.util.Arrays;

public class Mar25Q29 {

    public static void swap(int []arr,int firstIndex,int secondIndex)
        {
            if((firstIndex>arr.length&&secondIndex>arr.length)&&(firstIndex<0&&secondIndex<0)) {
                System.out.println("can't swap");
                return;
            }
            arr[firstIndex]=arr[firstIndex]^arr[secondIndex];
            arr[secondIndex]=arr[firstIndex]^arr[secondIndex];
            arr[firstIndex]=arr[firstIndex]^arr[secondIndex];
            System.out.println("swapped: "+ Arrays.toString(arr));

    }
    public static void main(String[]args)
    {
        int arr[]={1,2,3,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        swap(arr,2,3);
    }

}
