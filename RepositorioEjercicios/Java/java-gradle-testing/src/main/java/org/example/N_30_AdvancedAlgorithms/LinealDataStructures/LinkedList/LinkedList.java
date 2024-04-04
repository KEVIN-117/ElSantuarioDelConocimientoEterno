package org.example.N_30_AdvancedAlgorithms.LinealDataStructures.LinkedList;

import java.util.List;

public class LinkedList {
    protected Node head;
    protected Node tail;

    public LinkedList(Node head) {
        this.head = head;
        this.tail = head;
    }
    public LinkedList(List<Integer> list) {
        Node node = new Node(list.get(0));
        this.head = node;
        this.tail = node;
        for (int i = 1; i < list.size(); i++) {
            node.next = new Node(list.get(i));
            node = node.next;
        }
    }

    public Node oddEvenList(){
        if (head == null) return null;
        if (head.next == null) return head;

        Node odd = head;
        Node even = head.next;

        Node evenHead = even;
        Node oddHead = odd;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public void insert(Node node) {
        this.tail.next = node;
        this.tail = tail.next;
    }

    public void deleteNode(Node node) {
        node.next = null;
    }

    public Node searchNode(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void deleteNode(int value) {
        Node nodoDelete = searchNode(value);
        if (nodoDelete != null) {
            nodoDelete.previous = nodoDelete.next.next;
        }
    }
    public void prindData() {
        Node node = head;
        while (node != null) {
            System.out.println(node.value + " - " + node.isVisited);
            node = node.next;
        }
    }

    public void prindData(Node newhead) {
        Node node = newhead;
        while (node != null) {
            System.out.println(node.value+ " - " + node.isVisited);
            node = node.next;
        }
    }


    public void revertLinkedList(){
        Node actual = head;
        Node prev = null;
        while (actual != null){
            Node aux = actual.next;
            actual.next = prev;
            prev = actual;
            actual = aux;
        }
        head = tail;
        tail = prev;
    }

    public boolean hasCycle(Node head) {
        while (head != null) {
            if (head.isVisited) {
                return true;
            }
            head.isVisited = true;
            head = head.next;
        }
        return false;
    }



    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}

