package com.scoping;

public class LoadingProcess {

    {
        System.out.println("instance block 1");
    }
    int a=123123;
    LoadingProcess() {
        System.out.println("constructor");
    }
    {
        System.out.println("instance block 1");
    }
}
