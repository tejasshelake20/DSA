package com.tejas.abstract_class;


public class Main {
    public static void main(String[] args) {
        Parent s1 = new Son(28,22);
        s1.career();
        s1.partner();
        s1.hello();
        s1.normal();

        Parent d1 = new Daughter(23,26);
        d1.career();
        d1.partner();
        d1.hello();
        d1.normal();
    }
}

//final abstract class Parent --> Error ( No inheritance & Overriding possible with the 'final' keyword
abstract class Parent{
    int myAge;
    int partnerAge;

    public Parent(int myAge, int partnerAge){
        this.myAge = myAge;
        this.partnerAge = partnerAge;
    }

    void normal(){
        System.out.println("Parent normal method run..");
    }

    static void hello(){
        System.out.println("Static method hello..");
    }

    abstract void career();
    abstract void partner();
}


