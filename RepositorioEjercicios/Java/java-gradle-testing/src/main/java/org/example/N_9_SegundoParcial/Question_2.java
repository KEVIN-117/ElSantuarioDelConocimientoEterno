package org.example.N_9_SegundoParcial;

import java.util.LinkedList;
import java.util.Queue;

public class Question_2 {
    public static void main(String[] args) {
        Queue<Integer> c = new LinkedList<>();
        Queue<Integer> n = new LinkedList<>();
        c.add(10);
        n.add(1);
        while (!c.isEmpty()){
            int x = c.remove();
            int y = n.remove();
            System.out.print(x + " ");
            if (y < 3){
                c.add(x+y);
                n.add(y+1);
                c.add(x-y);
                n.add(y+1);
            }
        }
    }
}
