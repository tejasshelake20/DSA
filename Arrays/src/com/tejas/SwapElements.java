package com.tejas;
import java.util.Scanner;
import java.util.Arrays;
public class SwapElements {
    public static void main(String[] args) {
        int[] arr_name = {21,32,13,64};
        swap(arr_name, 1, 3);
        for(int i=0; i<arr_name.length; i++){
            System.out.print(arr_name[i] + " ");
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
