package com.tejas;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            builder.append(ch); // New Object is created at each iteration, it modifies the declared builder StringBuilder which is mutable.
        }
        System.out.println(builder);
       // builder = new StringBuilder(builder.toString());
        // System.out.println(builder + " " + builder);

        // Builder methods
        //System.out.println(builder.reverse());
        System.out.println(builder.append(9));
        System.out.println(builder.deleteCharAt(1));
        System.out.println(builder.reverse());

    }
}
