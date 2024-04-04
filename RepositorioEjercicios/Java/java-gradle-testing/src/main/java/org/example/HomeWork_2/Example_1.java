package org.example.HomeWork_2;

public class Example_1 {
    public static void main(String[] args) {
        int A[]={3,6,2,7,3,5,1};
        int sum=0;
        for(int i=0; i<A.length; i++){
            if(A[i]>A[i+1]){
                sum=sum+A[i];
            }
        }
        System.out.print(sum);
    }
}
