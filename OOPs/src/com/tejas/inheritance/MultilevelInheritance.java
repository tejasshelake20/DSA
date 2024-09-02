package com.tejas.inheritance;

public class MultilevelInheritance {
    public static void main(String[] args){
        BabyDog b1 = new BabyDog();
        b1.eat();
        b1.bark();
        b1.play();
    }
}
class Animal1{
    void eat(){
        System.out.println("Animals are eating..");
    }
}

class Dog1 extends Animal1{
    void bark(){
        System.out.println("Dog is barking..");
    }
}

class BabyDog extends Dog1{
    void play(){
        System.out.println("BabyDog is playing..");
    }
}
