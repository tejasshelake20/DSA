package com.tejas;

public class Main {
    public static void main(String[] args) {
        String name1 = "Mauli";
        String name2 = "Mauli";
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        String a = new String("Mauli");
        String b = new String("Mauli");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println();
        String one = "India";
        String two = new String("India");

        System.out.println(one == two);
        System.out.println(one.equals(two));

        System.out.println();
        String three = new String();
        three = "India";
        String four = new String();
        four = "India";

        System.out.println(three == four);
        System.out.println(three.equals(four));

        System.out.println();
        String five = new String();
        five = "India";
        String six = "India";

        System.out.println(five == six);
        System.out.println(five.equals(six));

        System.out.println();
        String seven = new String("India");
        String eight = "India";

        System.out.println(seven == eight);
        System.out.println(seven.equals(eight));

        System.out.printf("%.3f", Math.PI);

    }
}