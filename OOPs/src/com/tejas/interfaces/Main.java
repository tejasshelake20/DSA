package com.tejas.interfaces;

public class Main {
    public static void main(String[] args) {
        Engine c1 = new Car();

        // c1.brake(); --> Not access to reference type car;
        // only access to methods inside the Interface Engine

        Car newCar = new Car();

        newCar.start();
        newCar.stop();
        newCar.acc();
        newCar.brake();
        System.out.println(newCar.price);
    }
}
