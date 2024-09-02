package com.tejas;
// Ceiling of a number:
// Return the index of the element equals to the target or greatest number smaller than the target in the array
public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int ans = floorNum(arr, 14);
        System.out.println(ans);
    }

    static int floorNum(int[] arr, int target) {

        if(target < arr[0]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return end;
    }
}
