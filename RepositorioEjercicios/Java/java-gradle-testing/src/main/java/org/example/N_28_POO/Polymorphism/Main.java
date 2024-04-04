package org.example.N_28_POO.Polymorphism;

import org.example.N_28_POO.Polymorphism.Chunks.Coal;
import org.example.N_28_POO.Polymorphism.Chunks.Cube;
import org.example.N_28_POO.Polymorphism.Chunks.Earth;
import org.example.N_28_POO.Polymorphism.Chunks.RedStone;
import org.example.N_28_POO.Polymorphism.MineCraft.Game;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Coal coal = new Coal(10, 1, 1, "Carbon");
        Earth earth = new Earth(7, 1, 1, "Tierra");
        RedStone redStone = new RedStone(20, 1, 1, "Piedra Roja");
        ArrayList<Cube> list = new ArrayList<>();
        list.add(coal);
        list.add(earth);
        list.add(redStone);
        Game game = new Game(list);
        game.start();
    }
}
