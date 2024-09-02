package com.tejas.polymorphism;

public class CompileTimeOverloading {
    public static void main(String[] args) {
        Numbers n = new Numbers();
        System.out.println(n.sum(4,3));
        System.out.println(n.sum(2,5,3));
    }
}
class Numbers{
    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}
