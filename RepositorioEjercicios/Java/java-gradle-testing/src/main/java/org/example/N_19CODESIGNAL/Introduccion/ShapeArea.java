package org.example.N_19CODESIGNAL.Introduccion;

public class ShapeArea {
    /*
        A continuación definiremos un polígono n. Tu tarea es encontrar el área de un polígono para un n dado.
                                                              |_|
                                    |_|                     |_|_|_|
                  |_|             |_|_|_|                 |_|_|_|_|_|
        |_|     |_|_|_|         |_|_|_|_|_|             |_|_|_|_|_|_|_|
                  |_|             |_|_|_|                 |_|_|_|_|_|
                                    |_|                     |_|_|_|
                                                              |_|
        n=1        n=2              n=3                        n=4
        areas=1    area=5           area=13                    area=25;
     */
    public static void main(String[] args) {
        System.out.println(fun(4));
    }
    static int fun(int n){
        int value = 0;
        int[] matrix = new int[n+n-1];
        for (int i = 0; i < matrix.length; i++) {
            if (i%2==0){
                    value += n;
            }else {
                value += n-1;
            }
        }
        return value;
    }
}
