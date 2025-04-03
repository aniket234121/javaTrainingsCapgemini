package com.scoping;

public class Area
{
    public static int add(int x,int y)
    {
        return x+y;
    }
    public static int add(double x,double y)
    {
        return (int)(x+y);
    }
    public static float findArea(int radius)
    {
        return 3.14f*radius*radius;
    }
    public static void main(String[] args) {
//        System.out.println(findArea(5));
        System.out.println(add(5,5.0));
        Area a=new Area();
    }
    Area()
    {
        return;
    }
}
