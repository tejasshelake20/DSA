package com.tejas;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Function is void as not returning any new array,
    // it's actually sorting the original array & No extra space is required
    // i.e. Space complexity is O(1) --> Constant.
    static void bubbleSort(int[] arr){
        boolean swapped;
        // Run the steps n - 1 times
        for (int i=0; i< arr.length; i++){
            swapped = false;
            // For each step, max item will come at last respective index
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                 }
            }
            if(!swapped){ // !false  = true (No swap is occurred, array is sorted
                break; // As for i=0, swapped == false then,
                       // No need to check for further i = 2,3,4,5..
            }
        }

    }

//    static void swap(int[] arr){
//        for(int i=0; i<arr.length; i++){
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
//    }
}
