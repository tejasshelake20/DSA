package com.tejas;
// Question: https://www.geeksforgeeks.org/problems/rotation4723/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,7,7,7,8};
        System.out.println(rotationCount(arr));
        System.out.println(rotationCountWithDuplicates(arr));
    }

    // No Duplicates:
    static int rotationCount(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid + 1;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1 + 1;
            }

            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1+1;
    }

    // For Duplicates:
    static int rotationCountWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid + 1;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1 + 1;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(start < end && arr[start] > arr[start + 1]){
                    return start + 1;
                }
                start++;
                if(end > start && arr[end] < arr[end-1]){
                    return end - 1 + 1;
                }
                end++;
            }

            if(arr[start] < arr[mid] && (arr[start] == arr[mid] || arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = end - 1;
            }
        }
        return -1+1;
    }
}
