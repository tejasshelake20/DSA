package com.tejas;
import java.util.Arrays;
// Variable length Arguments as per input values
public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,5,1,4,43,8,12);
    }

    // Take as array of Integers or respective data type used
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
