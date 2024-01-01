package com.tejas;
// Search given target in given range
// Que. Find if 3 is present or not in the array from index (1, 4)
import java.util.Scanner;
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3 , 14, 28};
        int target = 3;
        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int[] arr, int target, int startIndex, int lastIndex){
        if(arr.length == 0){
            return -1;
        }
        for(int i=startIndex; i<=lastIndex; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
