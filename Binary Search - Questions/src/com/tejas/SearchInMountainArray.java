package com.tejas;
// Question: https://leetcode.com/problems/find-in-mountain-array/
// This is in array form
public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,3,1};
        System.out.println(findInMountainArray(array, 3));
    }

    static int findInMountainArray(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int ans = orderAgnosticBS(arr, target, 0, peak);
        if(ans != -1){
            return ans;
        }
        else{
            ans = orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
        }
        return ans;
    }
    static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
            if(start == end){
                return start;
            }
        }
        return -1;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}



