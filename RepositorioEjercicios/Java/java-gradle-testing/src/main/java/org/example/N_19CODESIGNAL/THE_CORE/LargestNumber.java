package org.example.N_19CODESIGNAL.THE_CORE;

public class LargestNumber {
    int solution(int n) {
        /* write unary test for this function using JUnit */
        StringBuilder builder = new StringBuilder(n);
        builder.append("9".repeat(Math.max(0, n)));
        return Integer.parseInt(builder.toString());
    }

    public static void main(String[] args) {
        LargestNumber largestNumber =  new LargestNumber();
        System.out.println(largestNumber.solution(1));
        System.out.println(largestNumber.solution(2));
        System.out.println(largestNumber.solution(9));
        System.out.println(largestNumber.solution(4));
        System.out.println(largestNumber.solution(5));
        System.out.println(largestNumber.solution(6));
        System.out.println(15/-4);
    }
}
