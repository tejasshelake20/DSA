package com.tejas;
import java.util.Scanner;
import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = sc.nextInt();
        int[] ans = searchIn2D(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchIn2D(int[][] arr, int target){
        for(int row=0; row< arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row+1, col+1};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
