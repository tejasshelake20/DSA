package com.tejas;
import java.util.Arrays;

public class FindFirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(firstAndLastIndex(arr, target)));
    }

    static int[] firstAndLastIndex(int[] arr, int target){
        int[] ans = {-1, -1};
        int start = search(arr, target, true); // O(log n)
        int end = search(arr, target, false);  // O(log n)
        // log n + log n = 2(log n) == approx.(log n) as in Time complexity constants are ignored to determine the time relationships
        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    static int search(int[] arr, int target, boolean searchFirstOccurrence){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                // potential ans found
                ans = mid;
                if(searchFirstOccurrence){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
