package com.tejas;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i=0; i<26; i++){
            // System.out.print('a' + i); // Prints all ascii values from 97 to 122
            char ch = ((char)('a' + i));
            series = series + ch +" ";
        }
        System.out.println(series);

    }

}
