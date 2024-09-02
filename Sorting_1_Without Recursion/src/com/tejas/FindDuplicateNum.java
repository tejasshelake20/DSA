package com.tejas;
import java.util.Arrays;
// Find Duplicate Number in Array (1,n)
// Question: https://leetcode.com/problems/find-the-duplicate-number/submissions/1139163943/

public class FindDuplicateNum {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,4,5};
        System.out.println(duplicateNum(arr));
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int duplicateNum(int[] nums){
        int i = 0;
        while(i<nums.length){

            if(nums[i] != i + 1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
//        for(i=0;i<nums.length;i++){
//            if(nums[i] != i + 1){
//                return nums[i];
//            }
//        }
        return -1;
    }
}
