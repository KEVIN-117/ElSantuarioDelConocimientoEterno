package org.example.N_28_POO.Inheritance.Example_1;

public class Square extends Figure{
    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;
    public Square(String name, String color, Integer a, Integer b, Integer c, Integer d) {
        super(name, color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    @Override
    public Double calculateArea() {
        return (double) (this.a*this.b);
    }

    @Override
    public Double calculatePerimeter() {
        return (double) (this.a+this.b+this.c+this.d);
    }
}
