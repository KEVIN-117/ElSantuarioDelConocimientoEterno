package org.example.HomeWork_13.Example_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            linkedList.addData(input.nextInt());
        }
        linkedList.showData();
        System.out.println();
        System.out.println("The number of even numbers in the linked list is: " + linkedList.counterPairNumber());
        DecimalFormat format = new DecimalFormat("#.###");
        System.out.println("Average of the data linked list: " + format.format(linkedList.averageData()));
        System.out.println("The bigger number of the linked list is: " + linkedList.biggerNumber());
        System.out.print("the numbers that do not repeat are: ");
        linkedList.printUniqueNumber();
    }
}
