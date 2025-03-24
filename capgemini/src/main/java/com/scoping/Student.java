package com.scoping;

public class Student {
    private String name;
    private byte age;
    private long no;

    public Student(String name, byte age,long no) {
        this.name = name;
        this.age = age;
        this.no=no;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + no;
    }
}
