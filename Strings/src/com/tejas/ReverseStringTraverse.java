package com.tejas;

public class ReverseStringTraverse {
    public static void main(String[] args) {
        String name = "Tejas";
        String newStr = "";
        for(int i=0; i< name.length();i++){
            char ch = name.charAt(i);
            newStr = ch + newStr;
        }
        System.out.println(newStr);
    }
}
