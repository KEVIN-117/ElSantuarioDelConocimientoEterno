package org.example.N_7_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Example_2 {
    public static void main(String[] args) {
        Queue<Integer> c1 = new LinkedList<Integer>();
        Queue<Integer> c2 = new LinkedList<Integer>();
        c1.add(10);
        c2.add(0);
        int aux = -1;
        while(!c1.isEmpty()){
            int x = c1.remove();
            int y = c2.remove();
            System.out.print(x + " ");
            if(aux == y){
                System.out.println();
                aux = y+1;
            }
            if(x>2){
                c1.add(x/2);
                c2.add(y+1);
                c1.add(x/3);
                c2.add(y+1);
            }
        }
    }
}
