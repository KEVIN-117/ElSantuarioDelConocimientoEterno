package org.example.N_28_POO.Inheritance.Example_1;

public class Triangle extends Figure{
    private Integer a;
    private Integer b;
    private Integer c;
    public Triangle(String name, String color, Integer a, Integer b, Integer c) {
        super(name, color);
        this.a = a;
        this.b = b;
        this.c = c;
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

    @Override
    public Double calculateArea() {
        int aux = this.a/2;
        Double h = Math.sqrt(Math.sqrt(aux) +Math.sqrt(this.b));
        return (this.a * h)/2;
    }

    @Override
    public Double calculatePerimeter() {
        return (double) (this.a + this.b +this.c);
    }
}
