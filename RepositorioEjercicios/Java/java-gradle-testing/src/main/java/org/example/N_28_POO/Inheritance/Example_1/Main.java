package org.example.N_28_POO.Inheritance.Example_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========SQUARE===========");
        Figure square = new Square("Square", "Red", 10,10,10,10);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());

        System.out.println("==========SQUARE===========");

        System.out.println("==========CIRCLE===========");
        Figure circle = new Circle("Circle", "Red", 10);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        System.out.println("==========CIRCLE===========");

        System.out.println("==========RECTANGLE===========");
        Figure rectangle = new Rectangle("Rectangle", "Red", 10, 10, 20,20);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println("==========RECTANGLE===========");

        System.out.println("==========TRIANGLE===========");
        Figure triangle = new Triangle("Triangle", "Red", 10, 10, 10);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
        System.out.println("==========TRIANGLE===========");
    }
}
