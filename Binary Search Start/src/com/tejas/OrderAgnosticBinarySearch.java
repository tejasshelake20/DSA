package com.tejas;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arrAsc = {-12, 6, 2, 5, 6, 7, 88, 92, 176, 224};
        int[] arrDesc = {88, 67, 7, 4, 2, -122, -334, -442, -880};

        System.out.println(orderAgnosticBS(arrAsc,92));
        System.out.println(orderAgnosticBS(arrDesc, -334));
    }

    static int orderAgnosticBS(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
//          int mid = (start + end)/2; // might start + end exceeds INT range
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }
            // Ascending Order:
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
    return -1;
    }
}
