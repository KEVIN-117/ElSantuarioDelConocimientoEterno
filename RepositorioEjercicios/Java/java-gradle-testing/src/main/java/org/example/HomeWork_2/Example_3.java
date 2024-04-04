package org.example.HomeWork_2;

public class Example_3 {
    public static void main(String[] args) {
        int A[]={7,9,2,8,3};
        for(int i=0;i<5;i++){
            for(int j=0;j<(4-i);j++){
                if(A[j]>A[j+1]){
                    int aux=A[j];
                    A[j]=A[j+1];
                    A[j+1]=aux;
                }
            }
        }
        for(int k=0;k<5;k++)
            System.out.print(A[k]+" ");
    }
}
