package com.tejas;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Given an array nums of integers, return how many of them contain an even number of digits.

import java.util.Scanner;
import java.util.Arrays;
public class OptimizedEvenDigits {
    public static void main(String[] args) {
        int[] arr = {-18, 124, 0, 1764, -98, 1, 1418};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (checkEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean checkEvenDigits(int num){
        int countDigit = 0;
        if(num == 0){
            countDigit = 1;
        }
        if(num < 0){
            num = num * -1;
        }

        countDigit = (int)(Math.log10(num)) + 1;
        return countDigit % 2 == 0;
    }
}
