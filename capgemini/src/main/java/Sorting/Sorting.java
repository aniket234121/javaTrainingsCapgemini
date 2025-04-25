package Sorting;

import java.util.Arrays;

public class Sorting {
    public static void quickSort(int[] arr, int left, int right) {
        if(left > right) {
            return;
        }
        int pivot=partition(arr,left,right);
        quickSort(arr,left,pivot-1);
        quickSort(arr,pivot+1,right);
    }
    public static int partition(int[] arr, int left, int right) {
        int pivotElement=arr[right];
        int pivot =left;
        for(int j=left;j<right;j++)
        {
            if(arr[j]<=pivotElement)
            {
                int temp=arr[pivot];
                arr[pivot]=arr[j];
                arr[j]=temp;
                pivot++;
            }
        }
        int temp=arr[pivot];
        arr[pivot]=arr[right];
        arr[right]=temp;
        return pivot;
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,0};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
