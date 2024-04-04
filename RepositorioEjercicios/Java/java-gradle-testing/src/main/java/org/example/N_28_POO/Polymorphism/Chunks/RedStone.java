package org.example.N_28_POO.Polymorphism.Chunks;

public class RedStone extends Cube{

    /**
     * @param hard
     * @param width
     * @param height
     * @param name
     */
    public RedStone(Integer hard, Integer width, Integer height, String name) {
        super(hard, width, height, name);
    }

    /**
     * @return
     */
    @Override
    public Cube destroy() {
        System.out.println("te doy una piedra roja");
        return this;
    }
}
