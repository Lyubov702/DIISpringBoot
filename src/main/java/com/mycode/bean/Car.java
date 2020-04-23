package com.mycode.bean;

public class Car {

    private IEngine engine;
    private String vin;


    public void drive(){
        System.out.println("car drives");
        engine.drive();
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public IEngine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", vin='" + vin + '\'' +
                '}';
    }
}
