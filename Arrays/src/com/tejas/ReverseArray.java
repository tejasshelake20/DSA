package com.tejas;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,12};
        ReverseArr(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void ReverseArr(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
