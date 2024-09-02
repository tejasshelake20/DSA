package com.tejas;
// Missing Number
// Question: https://leetcode.com/problems/missing-number/submissions/1138515372/
// Approach 1:
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1};
        int ans = missingNum(arr);
        System.out.println(ans);
    }

    static void cycleSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(correct == getMax(arr)){
                i++;
            }
            else{
                if(arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }
                else{
                    i++;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int missingNum(int[] arr){
        cycleSort(arr);
        for(int i=0; i< arr.length; i++){
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }
}
