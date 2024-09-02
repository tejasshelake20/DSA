package com.tejas;
// Search Minimum Element in the given array
import java.util.Scanner;
public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3 , 14, 28};
        System.out.println(minFind(arr));
    }
    static int minFind(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

}
