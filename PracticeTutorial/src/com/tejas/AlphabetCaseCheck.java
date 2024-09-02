package com.tejas;

import java.util.Scanner;
public class AlphabetCaseCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println(c);
        int asciivalue = c;
//        if(asciivalue>=65 && asciivalue<=90){
//            System.out.println("Uppercase");
//        }
//        if(asciivalue>=90 && asciivalue<=127){
//            System.out.println("Lowercase");
//        }
        if(c>='a' && c<='z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("UPPERCASE");
        }
    }
}
