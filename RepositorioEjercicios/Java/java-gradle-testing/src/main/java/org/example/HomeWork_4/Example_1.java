package org.example.HomeWork_4;

public class Example_1 {
    public static void main(String[] args) {
        System.out.println(equals(7, 9, 7));
        System.out.println(equals(8, 8, 8));
    }
    static int equals(int x, int y, int z){
        if ((x == y) && (y==z))
            return 1;
        else{
            if ((x == y) || (x == z) || (y == z))
                return 2;
            else
                return 3;
        }
    }
}
