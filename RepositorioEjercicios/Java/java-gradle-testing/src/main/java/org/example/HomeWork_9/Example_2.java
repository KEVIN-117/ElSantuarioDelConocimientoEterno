package org.example.HomeWork_9;
import java.util.*;
public class Example_2 {
    public static void main(String[] args) {
        Queue<Integer> c = new LinkedList<Integer>();
        c.add(10);
        while (!c.isEmpty()) {
            int x = c.remove();
            System.out.println(x + " ");
            if (x>2) {
                if (x%2==0) {
                    c.add(x/2);
                    c.add(x/2);
                }else{
                    c.add(x/2);
                    c.add((x/2)+1);
                }
            }
        }
    }
}
