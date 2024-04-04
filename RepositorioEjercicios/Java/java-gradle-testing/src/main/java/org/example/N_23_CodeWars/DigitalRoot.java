package org.example.N_23_CodeWars;

public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println(digitalRoot(493193));
    }
    public static int digitalRoot(int n){
        int addition = 0;
        while(n!=0){
            addition += n%10;
            n = n/10;
            
        }
        return addition;
    }
}
