package org.example.N_28_POO.Polymorphism.Chunks;

public class Earth extends Cube{
    public Earth(Integer hard, Integer width, Integer height, String name) {
        super(hard, width, height, name);
    }

    @Override
    public Cube destroy(){
        System.out.println("te doy tierra");
        return this;
    }
}
