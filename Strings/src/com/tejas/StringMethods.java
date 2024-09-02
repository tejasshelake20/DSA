package com.tejas;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('s',1));
        System.out.println(name.indexOf('s', 2));
        System.out.println(name.indexOf('a'));
        System.out.println("    nam  e   + me");
        System.out.println("    name".strip()+ "       me".strip());
        System.out.println(Arrays.toString(name.split("a")));
        System.out.println(name);
        System.out.println(name.indexOf('l',2));
        System.out.println(Arrays.toString(name.toCharArray()));

    }
}
