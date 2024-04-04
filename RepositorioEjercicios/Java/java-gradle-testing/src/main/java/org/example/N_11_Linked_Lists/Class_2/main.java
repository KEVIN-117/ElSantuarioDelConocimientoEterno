package org.example.N_11_Linked_Lists.Class_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < N; i++) {
            //linkedList.addData(input.nextInt());
            linkedList.addSort(input.nextInt());
        }
        linkedList.showData();

    }
}
