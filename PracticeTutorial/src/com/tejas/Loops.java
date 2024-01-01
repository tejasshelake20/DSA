package com.tejas;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // Print numbers 1 to n using for/while/do-while loops
        // For Loop:
        System.out.print("Output using For Loop:");
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        // While Loop:
        System.out.print("Output using While Loop:");
        int j=1;
        while(j<=n){
            System.out.print(j+" ");
            j++;
        }
        System.out.println();
        // Do-While Loop:
        System.out.print("Output using Do-While Loop:");
        int k=1;
        do{
            System.out.print(k+" ");
            k++;
        }while(k<=n);

    }
}
