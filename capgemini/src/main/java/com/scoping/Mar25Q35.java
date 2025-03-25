package com.scoping;

import java.util.Arrays;

public class Mar25Q35 {
    public static void swapOddIndexWithEven(int []nums){
        for(int i=0;i<nums.length-1;i+=2){
            int temp=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
        }
        System.out.println("after swap: "+ Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(nums));
        swapOddIndexWithEven(nums);
    }
}
