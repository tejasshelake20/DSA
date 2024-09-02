package com.tejas.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Programmer p1 = new Programmer();
        System.out.println(p1.salary);
        System.out.print(p1.bonus);
    }
}
class Employee{
    int salary = 40000;
}

class Programmer extends Employee{
    int bonus = 8000;
}
