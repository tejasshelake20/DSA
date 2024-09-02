package com.tejas.polymorphism;

public class RunTimeOverride {
    public static void main(String[] args) {
//        Circle c1 = new Circle();
//        Square s1 = new Square();
//        Triangle t1 = new Triangle();

        Shapes c1 = new Circle();
        Shapes s1 = new Square();
        //Shapes t1 = new Triangle();

        c1.area();
        s1.area();
        //t1.area();

    }
}

class Shapes{
    void area(){
        System.out.println("Area for shapes..");
    }
}

class Circle extends Shapes{
    void area(){
        System.out.println("Area of circle is pi * r * r");
    }
}

class Square extends Shapes{
    void area(){
        System.out.println("Area of square is side * side");
    }
}

class Triangle extends Shapes{
    void area(){
        System.out.println("Area of triangle is 0.5 * b * h");
    }
}
