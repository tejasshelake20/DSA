package com.tejas;
import java.util.Arrays;
public class MaxValueOfArray {
    public static void main(String[] args) {
        int[] arr_name = {1,3,23,8,18};
        System.out.println(max(arr_name));
        System.out.println(maxInRange(arr_name, 3,4));
    }

    // Add Edge cases here, like array being null
    static int max(int[] arr){

        if(arr.length == 0){
            return -1;
        }

        int maxElement = arr[0];
        for(int i=1; i<arr.length; i++){
                if(arr[i]>maxElement) {
                    maxElement = arr[i];
                }
        }
        return maxElement;
    }
    static int maxInRange(int[] arr, int start, int end){

        if(end > start){
            return -1;
        }

        if(arr == null){
            return  -1;
        }

        int maxElement = arr[start];
        for(int i=start; i<=end; i++){
            if(arr[i]>maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
}
