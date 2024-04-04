package org.example.N_19CODESIGNAL.Introduccion;

class Node{
    int value;
    Node next;
    public Node(int x) {
        this.value = x;
    }
}
public class CircleOfNumbers {
    int solution(int n, int firstNumber) {
        int half = (n/2)+1;
        Node header = new Node(0);
        Node aux = header;
        for (int i = 1; i < n; i++) {
            aux.next = new Node(i);
            aux = aux.next;
        }
        aux.next = header;
        Node aux2 = header;
        int res = 0;
        for (int i = 0; i < firstNumber+half; i++) {
            if (i + 1 == firstNumber + half){
                res = aux2.value;
                break;
            }
            aux2 = aux2.next;
        }
        return res;
    }
    public static void main(String[] args) {
        CircleOfNumbers circleOfNumbers = new CircleOfNumbers();
        System.out.println(circleOfNumbers.solution(10, 2));
        System.out.println(circleOfNumbers.solution(10, 7));
        System.out.println(circleOfNumbers.solution(4, 1));
    }
}