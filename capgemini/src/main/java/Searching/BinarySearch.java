package Searching;

public class BinarySearch {
//    public static int binaryREcursiveSearch(int[] arr, int key) {
//
//    }
    public static int binarySearch(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
     return -1;
    }
    public static void main(String[] args) {
        int [] arr={ 1,2 ,34,45,56,67,78};
        binarySearch(arr,34);

    }
}
