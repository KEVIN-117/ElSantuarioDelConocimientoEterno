package org.example.HomeWork_4;

public class Example_8 {
    public static void main(String[] args) {
        System.out.println("1 = " + isCousin(1));
        System.out.println(isCousin(3));
        System.out.println(isCousin(4));
        System.out.println(isCousin(5));
        System.out.println(isCousin(6));
        System.out.println(isCousin(7));
        System.out.println(isCousin(9));
        System.out.println(isCousin(10));
    }
    static int isCousin(int n){
        int counter = 0;
        for (int i = 2; i < n; i++){
            if (n%i == 0){
                counter++;
            }
        }
        if (counter == 0)
            return 1;
        else
            return 0;
    }
}
