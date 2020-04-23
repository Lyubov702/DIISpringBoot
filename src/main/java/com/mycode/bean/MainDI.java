package com.mycode.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainDI {
    public static void main(String[] args) {
        //byName
        ApplicationContext contextByName = new ClassPathXmlApplicationContext("byName-config.xml");
        Car car = (Car)contextByName.getBean("superCar");
        car.drive();
        //byType
        ApplicationContext contextByType = new ClassPathXmlApplicationContext("byType-config.xml");
       Car car2 = (Car)contextByType.getBean("BMW");
        car2.drive();
        //constructor
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor-config.xml");
        CarWithConstructor carWithConstructor= (CarWithConstructor) context.getBean("carConstructor");
        carWithConstructor.drive();
    }
}
