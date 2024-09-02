package com.tejas;
import java.util.Arrays;
import java.util.Scanner;
// Take input of a 2D array & Print it using for loop, toString Method & it's enhanced for-each loop.
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's start to give Input for 2D array: ");
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int col = sc.nextInt(); // Number of columns not mandatory to input i.e. it can be modified at the runTime with respect to the row length

        int[][] arr = new int[row][col];

        System.out.println("Let's start to give Input for 2D array: ");
        // Input:
        for(row=0; row<arr.length; row++){
//            System.out.println("Enter elements in "+ row +"rd row: ");
            // For each column in the row
            // Every Array at that row is length of that array.
            for(col=0; col<arr[row].length; col++){
//                System.out.println("Enter elements in "+ col +"rd column: ");
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.println("Output of array Using for loop: ");
        // Output:
        for(row=0; row<arr.length; row++){
            for(col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        System.out.println("Output of array Using toString Method: ");
        // Output:
        for(row=0; row<arr.length; row++){
                System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println("Output of array Using for-each Enhanced loop - toString Method: ");
        // Output:
        for(int[] a : arr){
                System.out.println(Arrays.toString(a));
        }
    }
}
