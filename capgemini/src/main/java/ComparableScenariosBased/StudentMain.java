package ComparableScenariosBased;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Student []students=new Student[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<students.length;i++) {
            System.out.println("enter rollno:");
            int roll=sc.nextInt();
            System.out.println("enter grade: ");
            int grade=sc.nextInt();
            students[i]=new Student(roll,grade);
        }
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
