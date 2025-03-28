package com.scoping;
import java.util.*;
class Mar25Q31 {
	public static void reverseFirstHalfArray(String[] arr) {
		int low=0;
		int high=arr.length/2 -1;
		while(low<high) {
			String temp = arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		System.out.println("reversed first half: "+Arrays.toString(arr));
	}
	public static void reverseSecondHalfArray(String[] arr) {
		int low=arr.length/2;
		int high=arr.length-1;
		while(low<high) {
			String temp = arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		System.out.println("reversed second half: "+Arrays.toString(arr));
	}
	public static void main(String[] args) {
		String[] arr = {"hi", "hello", "another", "aniket", "ram"};
		System.out.println(Arrays.toString(arr));
		reverseFirstHalfArray(arr);
		reverseSecondHalfArray(arr);

	}
}
