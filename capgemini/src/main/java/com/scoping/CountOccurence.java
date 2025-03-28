package com.scoping;

public class CountOccurence {
    public static int findMax(int[] nums)
    {
     int max=Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++)
     {
         if(nums[i]>max) max=nums[i];
     }
     return max;
    }
    public static void countOccurence(int[] nums) {
        int maxElem=findMax(nums);
        int [] count=new int[maxElem+1];
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }
        for(int i=0;i<count.length;i++)
        {   if(count[i]!=0)
            System.out.println(i+" : "+count[i]+" times");
        }
    }
    public static void main(String[] args) {
        int []nums={1,2,3,4,1,2,3,4,5,1,2,3,4,5,5};
        countOccurence(nums);

    }
}
