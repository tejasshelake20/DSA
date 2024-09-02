package com.tejas.nested_interface;
// Nested Interface within a class
public class A {
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{
    public boolean isOdd(int num){
        return (num & 1) == 1;
//        return num % 2 != 0;
    }

}

class Main{
    public static void main(String[] args) {
        B num = new B();
        System.out.println(num.isOdd(5));
        System.out.println(num.isOdd(6));
    }
}
