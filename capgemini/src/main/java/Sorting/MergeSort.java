package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int []arr, int low, int mid,int high)
    {
      int size1 = mid - low + 1;
      int size2 = high - mid;
      int []left = new int[size1];
      int []right = new int[size2];
      for (int i = 0; i < size1; i++) {
          left[i] = arr[low + i];
      }
      for (int i = 0; i < size2; i++) {
          right[i] = arr[mid + 1 + i];
      }

      int i = 0, j = 0;
      int k = low;
      while( i < size1 && j < size2){
          if(left[i] <= right[j]){
              arr[k] = left[i];
              i++;
          }
          else{
              arr[k] = right[j];
              j++;
          }
          k++;
      }
      while(i < size1){
          arr[k] = left[i];
          i++;
          k++;
      }
      while(j < size2){
          arr[k] = right[j];
          j++;
          k++;
      }
    }
    public static void mergeSort(int[] arr,int left,int right) {
        if(left<right) {
            int mid = (left + right) / 2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }

    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
