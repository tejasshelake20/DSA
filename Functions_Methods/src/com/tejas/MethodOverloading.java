package com.tejas;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(2.4f, 5.6f));
        System.out.println(sum(2,4,6f ));
    }

    static int sum(int a, int b){
        System.out.println("First Method");
        return a+b;
    }

    static float sum(float a, float b){
        System.out.println("Second Method");
        return a+b;
    }
    static float sum(int a, int b, float c){
        System.out.println("Third Method");
        return a+b+c;
    }

    static float sum(float a, float b,float c){
        System.out.println("Fourth Method");
        return a+b+c;
    }
}
