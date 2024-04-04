package org.example.N_30_AdvancedAlgorithms.LinealDataStructures.LinkedList;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(new Node(1));

        list.insert(new Node(2));
        list.insert(new Node(3));
        list.insert(new Node(4));
        list.insert(new Node(5));

        //list.deleteNode(3);
        list.prindData();

        //list.revertLinkedList();

        //list.prindData(list.oddEvenList());
        //list.prindData();
        List<Integer> list2 = List.of(1,5,3,2,4);
        LinkedList list3 = new LinkedList(list2);
        //list3.prindData();
        //list3.prindData(list3.oddEvenList());

        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(0);
        Node node4 = new Node(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(list.hasCycle(node1));

    }
}
