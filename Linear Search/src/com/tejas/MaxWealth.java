package com.tejas;
// Que. https://leetcode.com/problems/richest-customer-wealth/
// Maximum wealth from Customer account balances
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {7,3},
                {3,5},
                {2,4}
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int person=0; person<accounts.length; person++){
            int rowSum = 0;
            for(int accBal=0; accBal<accounts[person].length; accBal++){
                rowSum = rowSum + accounts[person][accBal];
            }
            if(rowSum > maxWealth){
                maxWealth = rowSum;
            }
        }
            return maxWealth;
    }
}
