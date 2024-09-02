package com.tejas;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 233;
//        arr[3] = 543;
//        arr[4] = 3;
//        System.out.println(arr[3]);

//        Input using for Loop:
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt(); // arr.length = 5
        }

//      Output using for Loop:
        System.out.print("First Output: ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Second Output: ");
//      Output using enhanced for-each Loop
        for(int num : arr){ // for every element in array, print the element
            System.out.print(num + " "); // here num represents element of array
        }
//      System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
