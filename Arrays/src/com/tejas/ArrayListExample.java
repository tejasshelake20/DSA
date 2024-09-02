package com.tejas;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);

        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        System.out.println(list.contains(22));
        System.out.println(list.set(2, 2));

        System.out.println(list);

    }
}
