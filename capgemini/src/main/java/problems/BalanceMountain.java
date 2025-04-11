package problems;

public class BalanceMountain {
//    public static void findMinVal2Change(int []arr)
//    {   int middleIndex;
//        if(arr.length%2==0) middleIndex=(arr.length/2)-1;
//        else middleIndex=arr.length/2;
//        int changedValues=0;
//        for(int i=middleIndex;i>0;i--)
//        {
//            if(arr[i]-arr[i-1]!=1)
//            {
//                changedValues++;
//                arr[i-1]=arr[i]-1;
//            }
//        }
//        if(arr.length%2==0)
//        {   int right=middleIndex+1;
//            for(int i=middleIndex;i>=0;i--)
//            {
//                if(arr[i]!=arr[right])
//                {
//                    arr[right]=arr[i];
//                    changedValues++;
//                }
//                right++;
//            }
//        }
//        else {
//            int right=middleIndex+1;
//            for(int i=middleIndex-1;i>=0;i--)
//            {
//                if(arr[i]!=arr[right])
//                {
//                    arr[right]=arr[i];
//                    changedValues++;
//                }
//                right++;
//            }
//        }
//        System.out.println(changedValues);
//    }
    public static void findMinVal2Change(int []arr)
    {
        int count=0;
        int left=(arr.length/2)-1;
        int right;
        if(arr.length%2==0) right=arr.length/2;
        else right=(arr.length/2)+1;

        while(left>=0 && right<arr.length)
        {
            if(arr[left+1]-arr[left]!=1)
            {
                count++;
                arr[left]=arr[left+1]-1;
                left--;
            }
            if(arr[right-1]-arr[right]!=1)
            {
                count++;
                arr[right]=arr[right-1]-1;
                right++;
            }
        }
        System.out.println(count);
    }
    public static void main(int a)
    {
        System.out.println(a);
    }
    public static void main(String... args) {
        int [] arr={3,3,4,4,5,5};
//        int []arr ={1,2,3,4,5};
//        int[]arr={1,1,1,2,3,2,1,1,1};
//        findMinVal2Change(arr);
       int a=10;

    }

}
