package com.tejas;
import java.util.Arrays;
import java.util.Scanner;
public class ChangeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,1,6,7,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99; // If you make change to objects via this reference varibale same objects will be changed
    }
    // Output : [99, 4, 1, 6, 7, 5]
    // The Value of reference variable is passed
}
