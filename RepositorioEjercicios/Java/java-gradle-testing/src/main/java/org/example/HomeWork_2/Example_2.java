package org.example.HomeWork_2;

public class Example_2 {
    public static void main(String[] args) {
        int A[]={3,8,3,9,6,8};
        int c;
        for(int i=0;i<6;i++){
            c=0;
            for(int j=0;j<i;j++){
                if(A[i]==A[j]){
                    c++;
                    break;
                }
            }
            if(c==0)
                System.out.print(A[i]+" ");
        }
    }
}
