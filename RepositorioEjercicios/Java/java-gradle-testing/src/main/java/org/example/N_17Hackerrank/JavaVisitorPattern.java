package org.example.N_17Hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    public int getResult() {
        //implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
        //implement this
        node.accept(this);
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        leaf.accept(this);
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    public int getResult() {
        //implement this

        return 1;
    }

    public void visitNode(TreeNode node) {
        //implement this
        node.accept(this);
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        leaf.accept(this);
    }
}

class FancyVisitor extends TreeVis {
    public int getResult() {
        //implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
        //implement this

    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this

    }
}

public class JavaVisitorPattern {

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Tree> nodes = new ArrayList<>();
        List<Color> colors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 0) {
                colors.add(Color.RED);
                nodes.add(new TreeNode(sc.nextInt(), Color.RED, i));
            } else {
                colors.add(Color.GREEN);
                nodes.add(new TreeNode(sc.nextInt(), Color.GREEN, i));
            }
        }
        return nodes.get(0);
    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}