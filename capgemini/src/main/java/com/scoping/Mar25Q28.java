package com.scoping;
import java.util.*;
class Mar25Q28{

public static int find(int[]arr, int key){
	for(int i=0;i<arr.length;i++)
		{if(arr[i]==key) return i;}
		return -1;
	}
	public static void main(String [] args){
		int[] arr={1,2,3,6,65,2342,89};
		System.out.println(Arrays.toString(arr));
		System.out.println(find(arr,4));
	}
}
