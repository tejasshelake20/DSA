package com.tejas;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        int a=10,b=20;
        swap(30,40);
        // Output 10 20 --> No Swap
        // Java works with Pass-By-Value
        System.out.println(a + " " + b);
    }
    static void swap(int a, int b){
        int temp = a;
        b = a;
        a = temp;
    }
//    This change will only be valid in this function scope only.
}
