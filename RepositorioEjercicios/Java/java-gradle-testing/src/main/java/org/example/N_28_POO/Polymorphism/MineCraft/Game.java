package org.example.N_28_POO.Polymorphism.MineCraft;

import org.example.N_28_POO.Polymorphism.Chunks.Cube;

import java.util.ArrayList;

public class Game {
    private ArrayList<Cube> wordList;
    private Hero hero;

    public Game(ArrayList<Cube> wordList) {
        this.wordList = wordList;
        this.hero = new Hero();
    }

    public void start(){
        for (Cube cube: this.wordList) {
            Cube item = null;

            do {
                item = hero.mining(cube);
            }while (item == null);
            hero.addItem(item);
        }
        System.out.println("the bag content");
        hero.showBag();
    }
}
