package problems;

import com.scoping.CountOccurence;

public class UniqueElements {
    public static void uniqueValues(int[]arr)
    {
        int size= CountOccurence.findMax(arr)+1;
        int count[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]==1)
            {System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,2,5,6,7,8,9,3};
        uniqueValues(arr);

    }
}
