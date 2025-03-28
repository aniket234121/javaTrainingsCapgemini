package org.example;
import com.scoping.Student;
import com.scoping.Student.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int reverseNum(int num) {
        int rev = 0;
        while(num != 0) {
            int remainder = num % 10;
            num = num / 10;
            rev = rev * 10 + remainder;
        }
        return rev;
    }
    public static int findGreatest(int num1, int num2,int num3) {
        int max;

        max= num1>num2 ?  num1>num3?num1:num3 : num2>num3?num2:num3;

        return max;
    }

    public static void main(String[] args) {
//     System.out.println("Hello World!");
//     Student student = new Student("John", (byte) 25,1234556789L);
//     System.out.println(student.toString());

//     System.out.println(reverseNum(123));

//     int num1=50;
//     int num2=60;
//     System.out.println(num1>num2?"num1":"num2");
//        int num3=num1>num2?num1:num2;
//        System.out.println(num3);

        System.out.println(findGreatest(80,90,70));
    }


}