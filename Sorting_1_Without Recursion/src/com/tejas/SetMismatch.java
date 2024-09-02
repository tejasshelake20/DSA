package com.tejas;
import java.util.Arrays;

// Set Mismatch
// Question: https://leetcode.com/problems/set-mismatch/description/

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        int[] result = findErrorNum(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] findErrorNum(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }

        int[] ans = new int[2];

        for(i = 0; i < arr.length ;i++){
            if(arr[i] != i + 1){
                return new int[] {arr[i], i + 1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int start, int second){
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;
    }
}
