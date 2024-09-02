package com.tejas;

public class StaticExample {
    public static void main(String[] args) {
        Human kunal = new Human("Kunal", 34);
        Human rahul = new Human("Rahul", 38);

//        System.out.println(rahul.age);
//        System.out.println(kunal.name);
//        System.out.println(kunal.population);
//        System.out.println(rahul.population);

        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}

class Human{
    String name;
    int age;

    static long population;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
//        this.population += 1;
        Human.population += 1;
    }
}
