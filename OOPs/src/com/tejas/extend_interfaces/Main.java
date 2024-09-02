package com.tejas.extend_interfaces;

public class Main implements Dog{
    @Override
    public void barking(){
        System.out.println("Barking..");
    }

    @Override
    public void eating() {
        System.out.println("Eating..");
    }

    public static void main(String[] args) {
        Main d1 = new Main();

        d1.eating();
        d1.barking();

    }
}

