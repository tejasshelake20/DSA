package com.tejas.inheritance;

public class SingleInheritance {
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
    }
}
class Animal{
    void eat(){
        System.out.println("Animals are eating..");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dogs are barking..");
    }
}
