package com.tejas;
import java.util.Scanner;
// Count Occurrence of a particular digit in given number
public class CountingOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter a integer to check occurrence: ");
        int checkNum = sc.nextInt();
        int count = 0;
        while(num > 0){
            if(checkNum == num%10){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
} 
