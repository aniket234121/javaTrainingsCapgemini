package com.scoping;

public class Employee {
    String name;
    String address;
    int age;
    long phone;
    Employee(String name,String address) {
        this.name=name;
        this.address=address;
    }
    Employee(String name,String address,int age) {
        this(name ,address);
        this.age=age;
    }
    Employee(String name,String address,int age,long phone) {
        this(name,address,age);
        this.phone=phone;
    }
    public String toString(){
        String str="name: "+ name+", address: "+address+(age!=0?", age: "+age:"")+(phone!=0?", phone: "+phone:"");
        return str;
    }
}
