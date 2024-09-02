package com.tejas;
import java.util.Arrays;

public class SelectionSort_Min {
    public static void main(String[] args) {
        int[] arr = {1,5,-2,3,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int getMinIndex(int[] arr, int start, int end){
        int minIndex = start;
        for(int i=start;i<=end;i++){
            if(arr[i]<arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length;i++){
            int first = i;
            int minIndex = getMinIndex(arr, first, arr.length-1);
            swap(arr, first, minIndex);
        }
    }
}
