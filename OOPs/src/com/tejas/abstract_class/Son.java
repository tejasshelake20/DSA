package com.tejas.abstract_class;

public class Son extends Parent{

    public Son(int myAge, int partnerAge){
        super(myAge, partnerAge);
    }

    @Override
    void career() {
        System.out.println("I want to be a doctor..");
    }

    @Override
    void partner(){
        System.out.println("My age is " + myAge + " & I like a girl having age " + partnerAge);
    }

    @Override
    void normal(){
        System.out.println("Son normal run..");
    }
}
