package com.tejas;
import java.util.Arrays;
// Missing Number
// Question: https://leetcode.com/problems/missing-number/submissions/1138515372/
// Approach 2:
public class MissingNumber2 {
    public static void main(String[] args) {
        int[] arr = {2,1,0,4};
        System.out.println(missingNum(arr));
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int missingNum(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        for(i=0; i< arr.length; i++){
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }
}
