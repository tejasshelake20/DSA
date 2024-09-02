package com.tejas.inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args){
        Dog2 d1 = new Dog2();
        d1.eat();
        d1.bark();
        Cat c1 = new Cat();
        c1.eat();
        c1.meow();
    }
}
class Animal2{
    void eat(){
        System.out.println("Animals are eating..");
    }
}

class Dog2 extends Animal2{
    void bark(){
        System.out.println("Dog is barking..");
    }
}

class Cat extends Animal2{
    void meow(){
        System.out.println("Cat is meowing..");
    }
}
