package com.tejas;
import java.util.Scanner;
// Find the Nth Fibonacci Number
public class FibonacciNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int firstNum = 0;
        int secondTerm = 1;
        int count = 2;
        while(count <= n){
            int temp = secondTerm;
            secondTerm = firstNum + secondTerm;
            firstNum = temp;
            count++;
        }
        System.out.println(secondTerm);
    }
}
