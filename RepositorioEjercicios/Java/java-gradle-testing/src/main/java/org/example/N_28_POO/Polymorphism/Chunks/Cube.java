package org.example.N_28_POO.Polymorphism.Chunks;

public abstract class Cube {
    private Integer hard;
    private Integer width;
    private Integer height;
    private String name;

    public Cube(Integer hard, Integer width, Integer height, String name){
        this.hard = hard;
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public abstract Cube destroy();


    public Integer getHard() {
        return hard;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }

    public String getName() {
        return name;
    }


    public void setHard(Integer hard) {
        this.hard = hard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }


    public Boolean mine(Integer miner){
        if(this.hard < miner)
            return true;
        this.hard -= miner;
        return false;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "hard=" + hard +
                ", width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
