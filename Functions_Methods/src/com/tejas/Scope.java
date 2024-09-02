package com.tejas;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int n = 1;
        for(int i=0;i<n;i++){
//          int a = 12; variable a is already defined in method main
            a = 100;
            int c = 2;
        }
        System.out.println(a); // 100
//      System.out.println(c); cannot find symbol due to loop scope
        int c = 20;
        System.out.println(c); // 20
    }
}
