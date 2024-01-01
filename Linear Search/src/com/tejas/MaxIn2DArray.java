package com.tejas;
import java.util.Scanner;
import java.util.Arrays;
public class MaxIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1,2,3},
                {4,9,6},
                {7,8,5}
        };
        System.out.println(max(arr));
    }

    static int max(int[][] arr){
        int max = arr[0][0];
        for(int row=0; row< arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}

