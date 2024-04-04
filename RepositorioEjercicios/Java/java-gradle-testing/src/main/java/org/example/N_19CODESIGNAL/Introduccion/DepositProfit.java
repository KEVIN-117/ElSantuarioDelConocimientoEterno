package org.example.N_19CODESIGNAL.Introduccion;

public class DepositProfit {
    int solution(int deposit, int rate, int threshold) {
        int counter = 0;
        while(deposit < threshold) {
            deposit += (deposit * rate / 100);
            counter++;
        }
        return counter;
    }
/*
deposit *= (100 + rate) / 100
 */
    public static void main(String[] args) {
        DepositProfit depositProfit = new DepositProfit();
        System.out.println(depositProfit.solution(100, 20, 170));
        System.out.println(depositProfit.solution(50, 25, 100));
        System.out.println(depositProfit.solution(100, 1, 101));
        System.out.println(depositProfit.solution(1, 100, 64));
        System.out.println(depositProfit.solution(20, 20, 50));
        System.out.println(depositProfit.solution(10, 10, 200));
    }

}
/*
3
4
1
6
6
 */