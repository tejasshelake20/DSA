package com.tejas;

import java.util.Arrays;

// Array is mutable in Java
public class ArrayPassing {
    public static void main(String[] args) {
        int[] nums = {2,4,3,1,8,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 99;
        arr[2] = 62;
    }
}
