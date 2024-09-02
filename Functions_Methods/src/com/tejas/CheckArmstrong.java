package com.tejas;
import java.lang.Math;
import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = checkArmstrong(num);
        System.out.println(ans);
    }

    static boolean checkArmstrong(int num){
        int original = num;
        int sum = 0;
        while(num > 0){
//          int rem = num % 10;
//          num = num / 10;
//          sum = sum + rem*rem*rem;

            sum = (int)(sum + (Math.pow(num % 10, 3)));
            num = num / 10;

        }
        return sum == original;
    }

}
