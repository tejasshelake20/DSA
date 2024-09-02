package com.tejas;
import java.util.ArrayList;
import java.util.List;

// Find All Duplicates in an Array
// Question: https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

public class FindAllDuplicates {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDuplicates(arr);
        System.out.println(result);
    }

    static List<Integer> findDuplicates(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                }
                else{
                    i++;
                }
        }
        // When the goal is about 'Find all' then first do cycle sort(or repsective
        // sort and then apply for loop
        for(i=0;i<nums.length;i++){
            if(nums[i] != i + 1) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
