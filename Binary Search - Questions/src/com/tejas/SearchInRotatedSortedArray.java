package com.tejas;

// Search in rotated sorted array without duplicates - All elements are distinct values
// Question: https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 7;
        System.out.println(search(arr, target));
        System.out.println(findPivot(arr));
    }

    // Find the index of target in rotated sorted array
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int pivot = findPivot(arr);
        if(target == arr[pivot]){
            return pivot;
        }

        // For first half:
        int ans = binarySearch(arr, target, 0, pivot - 1);
        if(ans == -1){
            ans = binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
        return ans;
    }

    // Find the pivot: The largest element from which the next elements are sorted in ascending order
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int pivot = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // Case 1:
            if(mid < end && arr[mid] > arr[mid+1]){
                pivot = mid;
            }
            // Case 2:
            if(mid > start && arr[mid-1] > arr[mid]){
                pivot = mid - 1;
            }

            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }

        }
        return pivot;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start < end){
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
