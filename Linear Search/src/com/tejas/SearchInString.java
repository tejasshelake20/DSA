package com.tejas;
import java.util.Arrays;
public class SearchInString {
    public static void main(String[] args) {
        String name = "Kunal";
        //System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name, 'l'));
        System.out.println(search2(name, 'n'));
    }

    static int search2(String str, char target){
        if(str.length()==0){
            return -1;
        }

        for(int i=0; i<str.length(); i++){
            if(target == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }

//        for(int i=0; i<str.length(); i++){
//            if(target == str.charAt(i)) {
//                return true;
//            }
//        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
