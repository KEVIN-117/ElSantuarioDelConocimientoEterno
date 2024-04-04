package org.example.Spoj;

import java.util.Arrays;

public class Example_9 {
    public static void main(String[] args) {
        int[] array = {1,5,4,6,5,8,9,5,3,5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //[1, 3, 4, 5, 5, 5, 5, 6, 8, 9]

    }
}
class BinariNode{
    private Object element;
    private BinariNode nodeLeft;
    private BinariNode nodeRigth;

    public BinariNode(Object element, BinariNode nodeLeft, BinariNode nodeRigth) {
        this.element = element;
        this.nodeLeft = nodeLeft;
        this.nodeRigth = nodeRigth;
    }

    void changeElement(Object item){
        this.element = item;
    }
    void changeElementLeft(BinariNode newNode){
        this.nodeLeft = newNode;
    }
    void changeElementRigth(BinariNode newNode){
        this.nodeRigth = newNode;
    }
    public Object getElement() {
        return element;
    }
    public BinariNode getNodeLeft() {
        return nodeLeft;
    }
    public BinariNode getNodeRigth() {
        return nodeRigth;
    }
}
