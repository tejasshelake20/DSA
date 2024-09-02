package com.tejas;
import java.util.Arrays;

public class SelectionSort_Max {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,-1,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int getMaxElementIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=0; i<=end; i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxElementIndex(arr, 0,last);
            swap(arr, maxIndex, last);
        }
    }
}
