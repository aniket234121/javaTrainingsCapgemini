package com.scoping;

public class UserMain {
    public static void main(String[] args) {
//        User u=new User();
//        u.setAge((byte)21);
//        u.setGender("male");
//        u.setName("aniket");
//        u.setUid(123234234);
//        System.out.println("age: "+u.getAge());
//        System.out.println("gender: "+u.getGender());
//        System.out.println("name: "+u.getName());
//        System.out.println("uid: "+u.getUid());


        // Factory design pattern
        User user=User.getUserObject(12,"aniket",12,"male");
        System.out.println(user);

    }
}
