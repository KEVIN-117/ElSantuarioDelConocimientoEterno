package org.example.N_28_POO.Inheritance.Example_1;

public abstract class Figure {
    private String name;
    private String color;

    public Figure(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //public abstract Integer calculateArea(int base, int altura);
    public abstract Double calculateArea();
    //public abstract Integer calculatePerimeter(int ...val);
    public abstract Double calculatePerimeter();
}
