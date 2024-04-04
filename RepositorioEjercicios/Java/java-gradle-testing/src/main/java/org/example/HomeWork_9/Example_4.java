package org.example.HomeWork_9;
import  java.util.*;
public class Example_4 {
    public static void main(String[] args) {
        Queue<Integer> c1 = new LinkedList<Integer>();
        Queue<Integer> c2 = new LinkedList<Integer>();
        c1.add(10);
        c2.add(0);
        int nivel = 0;
        while(!c1.isEmpty()){
            int x = c1.remove();
            int y = c2.remove();
            if (y == nivel) {
                System.out.println();
                nivel++;
            }
            System.out.print(x + " ");
            if (x>2) {
                c1.add(x/2);
                c2.add(y+1);
                c1.add(x/3);
                c2.add(y+1);
            }
        }
    }
}
