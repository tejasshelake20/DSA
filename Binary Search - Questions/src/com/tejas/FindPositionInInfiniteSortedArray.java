package com.tejas;
// Question: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// For Infinite sorted array: Don't consider the length means avoid arr.length
public class FindPositionInInfiniteSortedArray {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int ans = findPos(arr, 90);

        if (ans == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + ans);
    }

    static int findPos(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int tempStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = tempStart;
        }
        return binarySearch(arr, target, start, end);

    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}



