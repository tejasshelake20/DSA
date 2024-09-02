package com.tejas;
import java.util.Scanner;
public class All3DigitsArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        for(int i=100; i<1000; i++){
            if(checkArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean checkArmstrong(int num){
        int original = num;
        int sum = 0;
        while(num > 0){
            sum = (int)(sum + Math.pow(num % 10, 3));
            num = num / 10;
        }
        return sum == original;
    }

}
