package com.tejas;

public class Constructor2 {
    public static void main(String[] args) {
        Student random2 = new Student();
        System.out.println(random2.name);
    }
}

class Student{
    int rollno;
    String name;
    int marks;

    Student(){
        // This is how to call a constructor from another constructor using 'this' keyword
        // Internally: new Student() i.e. this --> Student
        this(13,"Tejas Shelake",86);
    }
    Student(int rollno,String name, int marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    
}