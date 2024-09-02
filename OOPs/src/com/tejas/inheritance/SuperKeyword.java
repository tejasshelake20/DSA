package com.tejas.inheritance;

public class SuperKeyword {
    public static void main(String[] args) {
        Developer p1 = new Developer(20000,300);
        System.out.println(p1.salary);
        System.out.print(p1.bonus);
    }
}
class Employee1{
    int salary = 40000;
    int gradePay = 200;
    Employee1(int salary,int gradePay){

        this.salary = salary;
        this.gradePay = gradePay;
        int total = this.salary + this.gradePay;
        System.out.println(salary + " + " + gradePay + " = " + total);
    }
}

class Developer extends Employee1{
    int bonus = 8000;


    Developer(int salary, int gradePay) {
        super(salary, gradePay);
    }
}
