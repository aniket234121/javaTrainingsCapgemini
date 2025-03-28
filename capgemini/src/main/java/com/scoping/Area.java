package com.scoping;

public class Area {
    public static float findArea(int radius)
    {
        return 3.14f*radius*radius;
    }
    public static void main(String[] args) {
        System.out.println(findArea(5));
    }
}
