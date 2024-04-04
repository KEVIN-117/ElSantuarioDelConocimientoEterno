package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Example_final {
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        // Write your code here.
        System.out.println();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }*/

    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        String[] array = new String[3];
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String aux = "";
            //Complete this line
            if(x < 100){
                String convert = String.valueOf(x);
                String cero = "0"+convert;
                aux = cero;

            }

            if (x >= 100){
                aux = String.valueOf(x);
            }
            map.put(s1, aux);

        }
        for (String i: map.keySet()) {
            System.out.printf(i + " " +map.get(i));
            System.out.println();
        }

        System.out.println("================================");

    }*/

    /*

        Usamos los números enteros a, b y n para crear la siguiente serie:
        (a + 2 ** 0 * b), (a + 2 ** 0 * b + 2 ** 1 * b), (a + 2 ** 0 * b + 2 ** 1 * b + 2 ** 2 * b + .... 2 ** n * b)
        te dan t consultas en forma de a, b y n. Para cada consulta, imprima la serie correspondiente a
        la dada a, b y n valores como una sola línea de n enteros separados por espacios.

        -> Formato de entrada
            La primera línea contiene un número entero t que indica el número de consultas.
            Cada línea i del t las líneas subsiguientes contienen tres enteros separados por espacios
            que describen los respectivos a, b y n valores para esa consulta.

        -> Formato de salida
            Para cada consulta, imprima la serie correspondiente en una nueva línea.
            Cada serie debe imprimirse en orden como una sola línea deenteros separados por espacios.

        Input           Output
            prueba_1
                2
                0 2 10      2 6 14 30 62 126 254 510 1022 2046
                5 3 5       8 14 26 50 98
            prueba_2
                3
                3 3 3           6 12 24
                0 0 5           0 0 0 0 0
                6 6 10          12 24 48 96 192 384 768 1536 3072 6144

     */
    /*public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int inicial = (a +1*b);
            System.out.print(inicial + " ");
            for(int j = 1; j<n; j++  ){
                int aux = 2;
                for (int k = 1; k < j; k++) {
                    aux *= 2;
                }
                inicial += aux*b;
                System.out.print(inicial + " ");
            }
            System.out.println();
        }
        in.close();
    }*/




    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        long t=sc.nextLong();
        for(long i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                    System.out.println("* byte");
                //Complete the code
                if(x >= -32768 && x <= 32767)
                    System.out.println("* short");
                if(x >= -2147483648  && x <= 2147483647)
                    System.out.println("* int");
                if(x >= -9223372036854775808L && x <= 9223372036854775807L){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
/*
java 100
cpp 65
python 50
 */
