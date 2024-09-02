package com.tejas;
import java.util.Arrays;
public class InnerClasses {

    static class Test{
        String name;
        public Test (String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(Arrays.toString(new int[] {3,4}));
    }
}
//class Test{
//    static String name;
//    public Test (String name){
//        Test.name = name;
//    }
//}


