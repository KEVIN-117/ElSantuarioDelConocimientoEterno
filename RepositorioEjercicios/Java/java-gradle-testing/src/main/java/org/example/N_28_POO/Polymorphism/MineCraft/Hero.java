package org.example.N_28_POO.Polymorphism.MineCraft;

import org.example.N_28_POO.Polymorphism.Chunks.Cube;

import java.util.ArrayList;

public class Hero {
    private ArrayList<Cube> bag;

    public Hero() {
        this.bag = new ArrayList<>();
    }

    public ArrayList<Cube> getBag() {
        return bag;
    }

    public void setBag(ArrayList<Cube> bag) {
        this.bag = bag;
    }

    public void addItem(Cube item){
        this.bag.add(item);
    }

    public Cube mining(Cube cubeMining){
        System.out.println("Nombre: " + cubeMining.getName() + " <> dureza: " + cubeMining.getHard());
        if (cubeMining.mine(1)){
            return cubeMining.destroy();
        }
        return null;
    }

    public void showBag(){
        for (Cube cube: this.bag) {
            System.out.println(cube);
        }
    }
}

