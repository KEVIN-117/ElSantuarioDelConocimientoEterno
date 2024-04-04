package org.example.HomeWork_9;
import java.util.*;
public class Example_3 {
    public static void main(String[] args) {
        Queue<Integer> c = new LinkedList<Integer>();
        Queue<Integer> n = new LinkedList<Integer>();
        c.add(0);
        n.add(0);
        while (!c.isEmpty()) {
            int x = c.remove();
            int y = n.remove();
            System.out.print(x + " ");
            if (y<3) {
                c.add(0);
                n.add(y+1);
                c.add(1);
                n.add(y+1);
            }
        }
    }
}
