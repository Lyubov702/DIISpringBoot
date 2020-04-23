package com.mycode.bean;

public class Diesel implements IEngine {
    public Diesel() {
    }

    @Override
    public void drive() {
        System.out.println("Diesel.drive");
    }
}
