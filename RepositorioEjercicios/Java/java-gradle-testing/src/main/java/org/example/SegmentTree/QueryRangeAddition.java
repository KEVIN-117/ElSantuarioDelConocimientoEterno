package org.example.SegmentTree;

public class QueryRangeAddition {
    private int[] tree;
    private int n;

    public QueryRangeAddition(int[] numbers){
        this.n = numbers.length;
        this.tree = new int[4*this.n];
        build(numbers, 1, 0, this.n-1);
    }

    private void build(int[] numbers, int node, int start, int end){
        if (start == end){
            this.tree[node] = numbers[start];
            return;
        }
        int mid = (start+end)/2;
        build(numbers, 2 * node, start, mid);
        build(numbers, 2 * node + 1, mid + 1, end);
        this.tree[node] = this.tree[2 * node] + this.tree[2 * node + 1];
    }

    public int querySum(int left, int right){
        return querySum(1, 0, this.n-1, left, right);
    }
    private int querySum(int node, int start, int end, int left, int right){
        if (right < start || left > end)
            return 0;
        if (left <= start && right >= end){
            // El rango del nodo está completamente dentro del rango de consulta
            //System.out.println(this.tree[node]);
            return this.tree[node];
        }
        int mid = (start+end)/2;
        int leftAddition = querySum(2*node, start, mid, left, right);
        int rightAddition = querySum(2*node, mid+1, end, left, right);
        return  leftAddition+rightAddition;
    }
}