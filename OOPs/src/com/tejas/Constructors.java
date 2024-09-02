package com.tejas;

public class Constructors {
    public static void main(String[] args) {
        StudentCopy s1 = new StudentCopy();
        s1.name = "Kunal";
        s1.rollno = 123;
        //s1.password = "vxyz12";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 90;
        s1.singlemarks = 1100;
        StudentCopy s2 = new StudentCopy(s1);
        System.out.println(s2.singlemarks);
        s1.singlemarks = 800;
        System.out.println(s2.singlemarks);
        s1.marks[0] = 100;
        s1.marks[1] = 70;
        s1.marks[2] = 90;
        for (int i=0;i<3;i++)
        {
            System.out.println(s2.marks[i]);
        }
//        System.out.println(s2.name);
//        System.out.println(s2.rollno);
//        System.out.println(s2.password);

    }
}

class StudentCopy {
    String name;
    int rollno;
    String password;
    int singlemarks;
    int marks[];
    // Shallow
//    StudentCopy(StudentCopy s1){
//        //marks = new int[3];
//        this.name = s1.name;
//        this.rollno = s1.rollno;
//        this.marks = s1.marks;
//        this.singlemarks = s1.singlemarks;
//
//    }

     //Deep
    StudentCopy(StudentCopy s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
        this.singlemarks = s1.singlemarks;

    }
    StudentCopy(){
        marks = new int[3];
        System.out.println("Constructor is called....");
    }
}
