package org.example.N_23_CodeWars.RankUp;


import java.util.*;

public class SortBinaryTreeByLevels {
    public static List<Integer> treeByLevels(Node node) {
        //off ya go!
        List<Integer> list = new ArrayList<>();
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(node);
        while (!nodes.isEmpty()){
            Node n = nodes.remove();
            if (n != null){
                list.add(n.value);
                nodes.add(n.left);
                nodes.add(n.right);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Node node = new Node(
                new Node(
                        new Node(
                                null,
                                null,
                                1),
                        new Node(
                                null,
                                null,
                                3),
                        8),
                new Node(
                        new Node(
                                null,
                                null,
                                4),
                        new Node(
                                null,
                                null,
                                5),
                        9),
                2);
        System.out.println(treeByLevels(node));
    }
}

class Node {
    public Node left;
    public Node right;
    public int value;

    public Node(Node l, Node r, int v) {
        left = l;
        right = r;
        value = v;
    }
}