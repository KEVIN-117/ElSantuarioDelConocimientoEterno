package org.example.N_19CODESIGNAL.Introduccion;

public class AbsoluteValuesSumMinimization {
    int solution(int[] a) {
        int sum = Integer.MAX_VALUE;
        int res = 0;
        for (int x : a) {
            int aux = 0;
            for (int i : a) {
                aux += Math.abs(i - x);
            }
            if (aux < sum){
                sum = aux;
                res = x;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        AbsoluteValuesSumMinimization absoluteValuesSumMinimization = new AbsoluteValuesSumMinimization();
        System.out.println(absoluteValuesSumMinimization.solution(new int[]{2, 4, 7}));
        System.out.println(absoluteValuesSumMinimization.solution(new int[]{2, 3}));
    }

}
