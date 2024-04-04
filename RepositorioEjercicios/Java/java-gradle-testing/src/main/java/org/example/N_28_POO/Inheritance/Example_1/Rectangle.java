package org.example.N_28_POO.Inheritance.Example_1;

public class Rectangle extends Figure{
    private Integer a1, a2;
    private Integer b1, b2;
    public Rectangle(String name, String color, Integer a1, Integer a2, Integer b1, Integer b2) {
        super(name, color);
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
    }

    public Integer getA1() {
        return a1;
    }

    public void setA1(Integer a1) {
        this.a1 = a1;
    }

    public Integer getA2() {
        return a2;
    }

    public void setA2(Integer a2) {
        this.a2 = a2;
    }

    public Integer getB1() {
        return b1;
    }

    public void setB1(Integer b1) {
        this.b1 = b1;
    }

    public Integer getB2() {
        return b2;
    }

    public void setB2(Integer b2) {
        this.b2 = b2;
    }

    @Override
    public Double calculateArea() {

        return (double) (this.a1 * this.b1);
    }

    @Override
    public Double calculatePerimeter() {
        return (double) (2*this.a1 + 2*this.b1);
    }
}
