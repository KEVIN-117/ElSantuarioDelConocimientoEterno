package org.example.HomeWork_7;

public class Example_2 {
    public static void main(String[] args) {
        int N = 25;
        int[] A ={5,5,5,5,5};
        //System.out.println(pagar(A, N, 0, 0,0));
    }
    static String pagar(int[] A , int N, int index, int suma, int sumaTotal){
        if(A[index] == N)
            return "Posible";
        if(index == A.length-1)
            return "Imposible";

        else{
            if (suma == N)
                return "Posible";
            if (sumaTotal == N)
                return "Posible";
            else
                return pagar(A, N, index+1,A[index]+A[index+1], sumaTotal+A[index]);

        }
    }
}
