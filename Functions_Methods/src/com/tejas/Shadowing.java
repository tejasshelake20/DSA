package com.tejas;

public class Shadowing {
    static int x = 90; // class variable
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; // Shadowed the class variable x = 90
//      System.out.println(x); Error --> Scope of local variable x starts after initialization
        x = 40;
        System.out.println(x); // 40
        fun(); // 90
        System.out.println(x); // 40
    }
    static void fun(){
        System.out.println(x); // Not working in that way of main() method.
    }
}

//Output: 90
//        40
//        90
//        40
