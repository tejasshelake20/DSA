package com.tejas.abstract_class;

public class Daughter extends Parent{

    public Daughter(int myAge, int partnerAge){
        super(myAge, partnerAge);
    }

    @Override
    void career() {
        System.out.println("I want to be a engineer..");
    }
    @Override
    void partner(){
        System.out.println("My age is " + myAge + " & I like a boy having age " + partnerAge);
    }
}
