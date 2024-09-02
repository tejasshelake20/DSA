package com.tejas;
import java.util.Scanner;
public class TempCoversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Degree Celsius to Fahrenheit
        System.out.println("Enter Temperature in Celsius: ");
        float celTemp = sc.nextFloat();
        float resFahrenheit = (celTemp * 9/5) + 32;
        System.out.println(celTemp + " Degree Celsius = " + resFahrenheit + " Fahrenheit" );

        // Fahrenheit to Degree Celsius
        System.out.println("Enter Temperature in Fahrenheit: ");
        float fahrenTemp = sc.nextFloat();
        float resCelsius = (fahrenTemp - 32)* 5/9;
        System.out.println(fahrenTemp + " Fahrenheit = " + resCelsius + " Degree Celsius" );
    }
}
