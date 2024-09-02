package com.tejas;
import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        int salary = sc.nextInt();
        if(salary>30000){
            salary = salary + 4000;
        }
        else if(salary>10000){
            salary = salary + 2000;
        }
        else{
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}
