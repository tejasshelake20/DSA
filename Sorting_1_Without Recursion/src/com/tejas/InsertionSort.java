package com.tejas;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,6,-2,8,5,-1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertionSort(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j>0; j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
}
