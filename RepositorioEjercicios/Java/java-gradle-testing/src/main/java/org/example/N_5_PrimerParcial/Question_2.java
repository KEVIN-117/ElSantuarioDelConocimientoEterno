package org.example.N_5_PrimerParcial;

public class Question_2 {
    public static void main(String[] args) {
        //Question_2
        System.out.println(fun(12));
        //Question_3
        System.out.println(fun2(2, 7));
        //Question_4
        System.out.println(fun_3(40));
    }
    static int fun(int A){
        int c = 0;
        for (int i = 1; i < A; i++) {
            if (A%i==0) {
                if (i%2==0) {
                    c= c+i;
                }

            }
        }
        return c;
    }
    static int fun2(int A, int B){
        if (B>10)
            return A;
        else
            return B+fun2(A+1, B+1);
    }
    static int fun_3(int A){
        if(A<4)
            return 1;
        else
            return fun_3(A/2)+fun_3(A/3);
    }
}
