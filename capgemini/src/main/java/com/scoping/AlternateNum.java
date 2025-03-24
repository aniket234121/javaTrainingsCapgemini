package com.scoping;

public class AlternateNum {
    public static int reverse(int num) {
        int rev=0;
        while(num!=0) {
            rev = rev*10+num%10;
            num=num/10;
        }
        return rev;
    }
    public static int alternateNum(int num1, int num2) {
        int ans=0;
        num1 = reverse(num1);
        while(num1!=0||num2!=0) {
            if(num1!=0)
            {
                ans=ans*10+num1%10;
                num1=num1/10;
            }
            if(num2!=0)
            {
                ans=ans*10+num2%10;
                num2=num2/10;
            }
        }


//        way II
//            num1=reverse(num1);
//            while(num1!=0&&num2!=0) {
//                ans=ans*10+num1%10;
//                ans=ans*10+num2%10;
//                num2=num2/10;
//                num1=num1/10;
//            }
//            if(num2!=0) {
//                ans=ans*10+num2;
//
//            }
//            if(num1!=0) {
//                ans=ans*10+num1;
//            }
      ;
        //another approach
//        if((int)Math.log10(num1)+1== (int)Math.log10(num2)+1) {
//
//            num1=reverse(num1);
//            while(num2!=0||num1!=0) {
//                ans=ans*10+num1%10;
//                ans=ans*10+num2%10;
//                num2=num2/10;
//                num1=num1/10;
//            }
//
//        }
//        else
//        {
//            if((int)Math.log10(num1)+1< (int)Math.log10(num2)+1)
//            {
//                num1=reverse(num1);
//                while(num1!=0) {
//                    ans=ans*10+num1%10;
//                    ans=ans*10+num2%10;
//                    num2=num2/10;
//                    num1=num1/10;
//                }
//                ans=ans*10+num2;
//
//            }
//            else
//            {
//                num1=reverse(num1);
//                while(num1!=0) {
//                    ans=ans*10+num1%10;
//                    ans=ans*10+num2%10;
//                    num2=num2/10;
//                    num1=num1/10;
//                }
//                ans=ans*10+num1;
//            }
//        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(alternateNum(12345,67));
    }
}
