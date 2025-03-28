package com.scoping;

import java.util.Arrays;

public class Mar25Q33 {
    public static void evenReverse(int[] nums)
    {
        int low=0;
        int high=nums.length-1;
        while(low<high)
        {
            if(low%2!=0 &&high%2!=0)
            {
                nums[low]=nums[high]^nums[low];
                nums[high]=nums[low]^nums[high];
                nums[low]=nums[high]^nums[low];

            }
            low++;
            high--;
        }
    }
    public static void oddReverse(int []nums)
    {
        int low=0;
        int high=nums.length-1;
        while(low<high)
        {
            if(low%2==0 &&high%2==0)
            {
                nums[low]=nums[high]^nums[low];
                nums[high]=nums[low]^nums[high];
                nums[low]=nums[high]^nums[low];

            }
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(nums));
        evenReverse(nums);
        System.out.println("after Even Reverse"+Arrays.toString(nums));
        Arrays.sort(nums);
        oddReverse(nums);
        System.out.println("after Odd Reverse"+Arrays.toString(nums));
    }
}
