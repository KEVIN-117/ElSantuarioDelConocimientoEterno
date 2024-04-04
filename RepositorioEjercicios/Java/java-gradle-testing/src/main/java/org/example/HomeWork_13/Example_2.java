package org.example.HomeWork_13;

import java.util.Scanner;

public class Example_2 {
    static Node header;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        header = null;
        for (int i = 0; i < N; i++) {
            addData(input.nextInt());
        }
        showData();
    }
    static void addData(int data){
        if (header == null){
            header = new Node(data);
        }else{
            Node temp = new Node(data);
            temp.linked = header;
            header = temp;
        }
    }
    static void showData(){
        Node p = header;
        while (p != null){
            Node q = p.linked;
            int counter = 0;
            while (q != null){
                if (q.Data % p.Data == 0){
                    counter++;
                }
                q = q.linked;
            }
            System.out.print(counter + " ");
            p = p.linked;
        }
    }
}
