package com.scoping;

import java.util.Arrays;

public class Mar25QSort {
    public static void sort(int[]height,String []names)
    {
        for(int i=0;i<height.length;i++) {

            for (int j = i + 1; j < height.length; j++) {
                if (height[i] < height[j]) {
                    int temp = height[i];
                    height[i] = height[j];
                    height[j] = temp;

                    String temp2 = names[i];
                    names[i] = names[j];
                    names[j] = temp2;
                }
            }
        }
            System.out.println(Arrays.toString(height) +" "+ Arrays.toString(names));
    }
    public static void main(String[] args)
    {
        String[] names={"Mary","John","Emma"};
        int[] heights={180,165,170};
//        System.out.println("before Sorting "+Arrays.toString(heights) +" "+ Arrays.toString(names));
        sort(heights,names);
    }
}
