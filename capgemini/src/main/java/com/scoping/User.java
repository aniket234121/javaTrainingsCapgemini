package com.scoping;

public class User {
    int uid;
    String name;
    byte age;
    String gender;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private User(int uid, String name, byte age, String gender) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public static User getUserObject(int uid, String name,int age, String gender) {
        return new User(uid, name, (byte)age, gender);
    }

    public String toString() {
        return "User{ \n" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                "\n}";
    }

}
