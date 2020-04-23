package com.mycode.bean;

public class V8 implements IEngine {
    public V8() {
    }

    @Override
    public void drive() {
        System.out.println("V8.drive");
    }
}
