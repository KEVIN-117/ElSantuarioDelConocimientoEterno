package org.example.N_28_POO.Inheritance.Example_1;

public class Circle extends Figure{
    private Integer radius;
    public Circle(String name, String color, Integer radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {

        return (Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public Double calculatePerimeter() {

        return 2 * Math.PI * this.radius;
    }
}
