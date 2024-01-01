package com.tejas;

public class If_For_While_Intro {
    public static void main(String[] args){
        if(true){
            System.out.println("Hello World");
        }
        if (false) {

            System.out.println("Hello World");
        }

        System.out.println("While Loop");
        int count = 1;
        while(count != 5){
            System.out.println(count);
            count++;
        }

        System.out.println("For Loop");
        for(int i=1;i!=5;i++){
            System.out.println(i);
        }
    }
}
