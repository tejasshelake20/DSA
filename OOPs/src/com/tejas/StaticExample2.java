package com.tejas;

public class StaticExample2 {
    public static void main(String[] args) {
        // greetings(); // Error --> Non-Static method can not be referenced from a static context
        fun();

    }

    static void fun(){
        StaticExample2 funObj = new StaticExample2();
        funObj.greetings();
    }
//     void fun2(){
//        greetings();
//     }
    void greetings(){
        System.out.println("Hello World..");
    }
}
