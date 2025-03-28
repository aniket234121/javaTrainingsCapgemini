package com.scoping;
import java.util.*;
class Mar25Q30{
	public static void reverseArray(String[] arr)
	{
		System.out.println(" before reverse: "+Arrays.toString(arr));
		int low=0;
		int high=arr.length-1;
		while(low<high)
		{   String temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;

			low++;
			high--;
		}
		
		System.out.println(" after reverse: "+Arrays.toString(arr));
	}
	public static void main(String[] args){
		String [] arr={"hi","hello","another","aniket","ram"};
		reverseArray(arr);
		}
}
