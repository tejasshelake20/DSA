package com.tejas;
// Search in Rotated Sorted Array - With Duplicates: Returns True if the target is present, otherwise returns false
// Question: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
public class SRSAWithDuplicates2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 2;
        System.out.println(search(arr, target));
        //System.out.println(findPivotWithDuplicates(arr));
    }

    // Find the index of target in rotated sorted array
    static boolean search(int[] arr, int target){

        int pivot = findPivotWithDuplicates(arr);
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1) != -1;
        }
        if(target == arr[pivot]){
            return true;
        }


        // For first half:
        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1) != -1;
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1) != -1;

    }

    // Find the pivot: The largest element from which the next elements are sorted in ascending order
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Case 1:
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // Case 2:
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // Need to check the start is pivot or not
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++; // otherwise, arr[start] is ignored
                // Need to check the end is pivot or not
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1; // otherwise, arr[end] is ignored
                }
                end--;
            }

            // If Left side is sorted then, pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
