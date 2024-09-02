package com.tejas;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Tejas Shelake";
        greet(name);
    }
//    Prints the Value of actual name i.e. OUTPUT: Tejas Shelake instead of Mauli
//    static void greet(String name){
//        name = "Mauli";
//        System.out.println(name);
//    }

    static void greet(String sayName){
        System.out.println(sayName);
    }


}
