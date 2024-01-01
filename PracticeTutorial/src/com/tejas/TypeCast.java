package com.tejas;
import java.util.Scanner;
public class TypeCast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Type Conversion --> Input Integer also can print the Float Value
        // Smaller to Bigger Data Type Possible
        // Byte -> Short -> Int -> Long -> Float -> Double
//        float num = sc.nextFloat();
//        System.out.println(num);

        // Type Cast | Narrowing Conversion --> Not Automatic Conversion
        // Converting One Data Type to another which are incompatible Using Casting Operator
        // Double -> Float -> Long -> Int -> Short -> Byte
        int num2 = (int)(67.56);
        System.out.println(num2); // Output: 67 as a Integer

        // Automatic Type Promotion in Expressions
        //int a = 258;
        //byte b = (byte)(a);
        //System.out.println(b); // Output: 2 as Max value of Byte is 256 then: 258 % 256 = 2;

        //byte c = 40;
        //byte d = 50;
        //byte e = 100;
        //int f = c * d / e;
        //System.out.println(f);

        System.out.println("Hello Hello Hello Hello");
        System.out.println("नमस्ते");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) -  (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);
    }
}
