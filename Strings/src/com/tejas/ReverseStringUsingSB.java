package com.tejas;

import java.util.Arrays;

public class ReverseStringUsingSB {
    public static void main(String[] args) {
        String name = "Tejas";
        System.out.println(reverseString(name));
    }

    static String reverseString(String str){
        StringBuilder newStr = new StringBuilder(str);
        newStr.reverse();
        return newStr.toString();
    }
}
