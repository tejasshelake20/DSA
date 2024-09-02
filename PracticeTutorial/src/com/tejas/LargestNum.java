package com.tejas;

import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

//        int max = num1;
//        if(num2 > max){
//            max = num2;
//        }
//        if(num3 > max){
//            max = num3;
//        }
//
        int max = Math.max(num1,Math.max(num2,num3));

        System.out.println("The maximum number is: " + max);
    }
}
