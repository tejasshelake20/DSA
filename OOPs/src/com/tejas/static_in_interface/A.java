package com.tejas.static_in_interface;

public interface A {
    // static interface methods should always have body
    // Call via the interface name in main method i.e. A.greeting();
    static void greeting(){
        System.out.println("Hello World..");
    }
}
