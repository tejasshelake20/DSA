package com.tejas;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Given an array nums of integers, return how many of them contain an even number of digits.

import java.util.Scanner;
import java.util.Arrays;
public class EvenDigits {
    public static void main(String[] args) {
       int[] arr = {-18, 124, 0, 1764, -98, 1, 1418};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(checkEvenDigits(num)){
                count++;
            }
//            if(checkEvenDigitsByString(num)){
//                count++;
//            }
        }
        return count;
    }

    // Method 1: By Counting number of digits - Function to check the number contains the ven number of digits or not
    static boolean checkEvenDigits(int num){
        if(num < 0){
            num = num * -1;
        }

        // 1. Count the Number of digits
        // 2. Divide the number by 10 till number becomes 0, take count of divide operations
        int count = 0;
        if(num == 0){
            count = 1;
        }
        while(num>0){
            num = num/10;
            count++;
        }
        return count%2==0;
    }

    // Method 2: Function to check the number contains the ven number of digits or not
    // Convert the given number to a String & Count the string.length()
    // Check the string.length() is even or not
    // Return boolean of even(true) or odd(false) number of digits

//    static boolean checkEvenDigitsByString(int num){
//        if(num < 0){
//            num = num * -1;
//        }
//        String str = Integer.toString(num);
//        return str.length() % 2 == 0;
//    }

}
