package com.tejas;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,44,46,48};
        //int target = 5;
        System.out.println(binarySearchCode(nums, 44));
    }
    static int binarySearchCode(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
//          int mid = (start + end)/2; // might start + end exceeds INT range
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                // index of target element is found
                return mid;
            }
        }
        return -1;
    }
}
