package org.example.HomeWork_9;
import java.util.*;
public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> c1 = new LinkedList<Integer>();
        Queue<Integer> c2 = new LinkedList<Integer>();
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            c1.add(input.nextInt());
        }
        while (!c1.isEmpty()) {
            if (c1.peek()%2==0)
                c2.add(c1.remove());
            else
                c1.remove();
        }
        while (!c2.isEmpty())
            System.out.print(c2.remove() + " ");
    }
}
