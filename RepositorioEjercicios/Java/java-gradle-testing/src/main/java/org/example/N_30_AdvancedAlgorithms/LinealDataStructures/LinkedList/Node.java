package org.example.N_30_AdvancedAlgorithms.LinealDataStructures.LinkedList;

public class Node {
    protected int value;
    protected Node next;
    protected Node previous;
    protected boolean isVisited;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.previous = null;
        this.isVisited = false;
    }

    public void addNextNode(Node newNode) {
        this.next = newNode;
    }

    public void addPreviousNode(Node newNode) {
        this.previous = newNode;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setValue(int newValue) {
        this.value = newValue;
    }

    public void deleteNextLink(Node  node) {
        this.next = null;
    }

    public void deletePreviousLink(Node node) {
        this.previous = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                ", previous=" + previous +
                '}';
    }
}
