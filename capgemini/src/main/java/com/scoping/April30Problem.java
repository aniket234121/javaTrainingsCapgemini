package com.scoping;

public class April30Problem {
    public static int sum(String s)
    {
        int currentNum=0;
        int sum=0;
        int count=0;
        char [] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
           if(i!=arr.length-1)
           {
               if(Character.isDigit(arr[i])&&!Character.isDigit(arr[i+1]))
               {
                   if(currentNum!=0)
                   {
                       currentNum*=10;
                       currentNum+=Integer.parseInt(arr[i]+"");
                   }
                   else {
                       currentNum = Integer.parseInt(arr[i]+"");
                   }
                   sum+=currentNum;
                   currentNum=0;
               }else if(Character.isDigit(arr[i])&&Character.isDigit(arr[i+1]))
               {
                   currentNum*=10;
                   currentNum+=Integer.parseInt(arr[i]+"");
               }
           }
           else {
               if(Character.isDigit(arr[i])&& currentNum!=0)
               {
                   currentNum*=10;
                   currentNum+=Integer.parseInt(arr[i]+"");
                   sum+=currentNum;
               }
               else if(Character.isDigit(arr[i])&&currentNum==0){
                   sum+=Integer.parseInt(arr[i]+"");
               }
           }

        }


        return sum;
    }
    public static void main(String[] args) {
        String input="AbcD1PQR3X4";
        String input2="Abc123XY23K8";
        System.out.println(sum(input));
    }
}
