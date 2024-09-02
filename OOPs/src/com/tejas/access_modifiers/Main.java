package com.tejas.access_modifiers;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1,46, "Kunal");
        System.out.println(s1.getMarks());
        s1.setMarks(56);
        System.out.println(s1.getMarks());
    }
}

class Student{
    int rollno;
    private int marks;
    String name;

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    Student(int rollno, int marks, String name){
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }
}
