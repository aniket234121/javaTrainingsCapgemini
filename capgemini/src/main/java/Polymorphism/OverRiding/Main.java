package Polymorphism.OverRiding;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Student s1 = new Student("John Doe", 22);
//        System.out.println(s1);
        Planet p = new Planet("Jupiter", 88, 98349239423l, 40);
        System.out.println(p);
        Planet p2 = new Planet("Jupiter", 88, 98349239423l, 40);
        System.out.println(p.equals(p2));
        Planet p3=(Planet)p.clone();
        System.out.println(p3);
    }

}