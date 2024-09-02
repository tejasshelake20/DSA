package com.tejas.interfaces;

public class Car implements Brake, Engine, Media{
    @Override
    public void brake() {
        System.out.println("Apply the brake..");
    }

    @Override
    public void stop() {
        System.out.println("Stop the car..");
    }

    @Override
    public void start() {
        System.out.println("Start the car..");
    }

    @Override
    public void acc() {
        System.out.println("Accelerate the car..");
    }
}
