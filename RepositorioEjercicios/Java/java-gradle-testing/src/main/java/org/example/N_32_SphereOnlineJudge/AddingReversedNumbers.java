package org.example.N_32_SphereOnlineJudge;

import java.util.Scanner;
import java.util.Stack;

public class AddingReversedNumbers {
    public int solution(int a, int b){
        Stack<Integer> aReverse = reverse(a);
        Stack<Integer> bReverse = reverse(b);
        StringBuilder suma = new StringBuilder();
        int aux = 0;
        while (!aReverse.isEmpty() || !bReverse.isEmpty()){
            int x = !aReverse.isEmpty()? aReverse.pop() : 0;
            int y = !bReverse.isEmpty()? bReverse.pop() : 0;
            int res = x+y+aux;
            aux = res/10;

            suma.append(res % 10);
        }
        if (aux >= 1){
            suma.append(aux);
        }
        return Integer.parseInt(String.valueOf(suma));
    }
    private Stack<Integer> reverse(int a){
        Stack<Integer> stack = new Stack<>();
        while (a != 0){
            stack.push(a % 10);
            a = a/10;
        }
        return stack;
    }
    public static void main(String[] args) {
        AddingReversedNumbers reversedNumbers = new AddingReversedNumbers();

        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        while (n >= 1 ){
            System.out.println(reversedNumbers.solution(x.nextInt(), x.nextInt()));
            n -= 1;
        }

    }
}
