package com.tejas;
import java.util.ArrayList;
import java.lang.Integer;

public class StringOperators {
    public static void main(String[] args) {
        System.out.println('a' +'b');                                     // 195
        System.out.println("a" + "b");                                    // ab
        System.out.println('a' + 3);                                      // 100 (a = 97 + 3)
        System.out.println((char) ('a' + 3));                             // d
        System.out.println("a" + 1);                                      // a1
        System.out.println("Kunal" + new ArrayList<>());                  // Kunal[]
        int num = 56;
        System.out.println("Kunal" + num);                               // Kunal56
        // System.out.println(new ArrayList<>() + new ArrayList());      // Error
        System.out.println(new ArrayList<>() + " " + new ArrayList<>()); // [] []
        String result = new ArrayList<>() + " " + new ArrayList<>();     // [] []
        System.out.println(result);
        System.out.println("a" + 'a');
    }
}
