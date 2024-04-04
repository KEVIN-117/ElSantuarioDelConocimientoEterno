package org.example.N_28_POO.Polymorphism.Chunks;

public class Coal extends Cube{

    public Coal(Integer hard, Integer width, Integer height, String name) {
        super(hard, width, height, name);
    }

    /**
     * @return
     */
    @Override
    public Cube destroy() {
        System.out.println("te doy un carbon");
        return this;
    }
}
