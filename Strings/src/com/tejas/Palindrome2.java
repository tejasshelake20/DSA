package com.tejas;
// Check whether the given string is palindrome or not
// Approach: Using the String Builder method
public class Palindrome2 {
    public static void main(String[] args) {
        String str = "adcfdcda";
        System.out.println(checkPalindrome(str));
    }

    static boolean checkPalindrome(String str){
        if(str == null){
            return false;
        }
        if(str.length() == 0){
            return false;
        }
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
//      String rev = builder.toString();
        return str.equals(builder.toString());
//        if(str.equals(rev)){
//            return true;
//        }
//        return false;
    }
}
