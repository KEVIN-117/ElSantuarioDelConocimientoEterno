package org.example.N_23_CodeWars;
import java.util.stream.IntStream;

/**
 * @url urlDelEjercicio
 */

public class GrasshopperSummation {
    public static void main(String[] args) {
        System.out.println(GrassHopper.summation(8));
    }
    public class GrassHopper {

        /**
         *
         * @param n
         * @return suma todos los numeros en el rango de n
         */
        public static int summation(int n) {
            return  n*(n+1)/2;
        }
    }



    public class GrassHopper2 {

        public static int summation(int n) {

            return IntStream.rangeClosed(1,n).sum();
        }
    }
}
