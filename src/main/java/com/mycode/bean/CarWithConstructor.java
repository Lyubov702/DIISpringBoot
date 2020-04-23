package com.mycode.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CarWithConstructor {
    private IEngine engine;
    private String vin;

    public CarWithConstructor(IEngine engine, String vin) {
        this.engine = engine;
        this.vin = vin;
    }

    public void drive() {
        System.out.println("car drives");
        engine.drive();
    }

/*    @Autowired
    public void setEngine(@Qualifier("disel_2.0") IEngine engine) {
        this.engine = engine;
    }*/

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

