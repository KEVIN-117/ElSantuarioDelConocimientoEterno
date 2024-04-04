package org.example.ACM;

public class Or {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 6, 8, 2, 3, 4, 6, 8, 10};
        int xor = 0;
        int and = 0;
        int or = 0;
        int not = 0;
        int dl = 0;
        int de = 0;

        for(int i : numbers){
            xor ^= i;
            and &= i;
            or |= i;
            dl <<= i;
            de >>= i;
        }
        System.out.println(xor);
        System.out.println(and);
        System.out.println(or);
        System.out.println(not);
        System.out.println(dl);
        System.out.println(de);
    }
}
