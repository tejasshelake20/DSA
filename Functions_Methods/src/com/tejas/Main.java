package com.tejas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(sum(20,30));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(greet(name));
    }

    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    static String greet(String name){
        String greeting = "Hello " + name;
        return greeting;
    }
}
