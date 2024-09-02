package com.tejas;
// Check whether string is palindrome or not
// Approach: For loop & While loop
public class Palindrome {
    public static void main(String[] args) {
        String str = "teet";
        System.out.println(checkPalindromeUsingFor(str));
    }

    static boolean checkPalindromeUsingFor(String str){
        if(str == null){
            return false;
        }
        if(str.length() == 0){
            return false;
        }
        str = str.toLowerCase();
        for(int i = 0; i < str.length() / 2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }

    static boolean checkPalindromeUsingWhile(String str){
        if(str == null){
            return false;
        }
        if(str.length() == 0){
            return false;
        }
        str = str.toLowerCase();
        int i = 0;
        char start = 0;
        char end = str.charAt(str.length() - 1);
        while(start < end) {
            start = str.charAt(i);
            end = str.charAt(str.length() - 1 - i);
            if (start == end) {
                i++;
            }
            return true;
        }
        return false;

    }

}
