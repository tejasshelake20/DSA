package com.tejas;
import java.util.ArrayList;
import java.util.List;

// Find All Numbers Disappeared in an Array
// Question: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result;
        result = findDisappearedNumbers(arr);
        System.out.println(result);
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> ansList = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        for(i=0;i< nums.length;i++){
            if(nums[i] != i+1){
                ansList.add(i+1);
            }
        }
        return ansList;
    }


}
