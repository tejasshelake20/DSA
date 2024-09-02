package com.tejas;

public class PracticeBS {
    public static void main(String[] args) {
        int[] arr = {-2,0,4,6,8,10,112,2456};
        System.out.println(binarySearch1(arr,10));;
    }
    static int binarySearch1(int[] arr, int key){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(key < arr[mid]){
                end = mid - 1;
            }
            else if(key > arr[mid]){
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
