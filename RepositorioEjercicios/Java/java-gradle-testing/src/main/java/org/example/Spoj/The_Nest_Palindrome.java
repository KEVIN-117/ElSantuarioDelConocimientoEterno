package org.example.Spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class The_Nest_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long N = input.nextLong();
        for (int i = 0; i < N; i++) {
            final String s = input.next();
            //System.out.println(getNextPalindrome(s));
            System.out.println(bruteForce(s));
        }
    }

    private static String bruteForce(String s) {
        BigInteger i = new BigInteger(s);
        while (true){
            i = i.add(BigInteger.ONE);
            String result = i.toString();
            if (isPalindrome(result)){
                return result;
            }
        }
    }

    private static boolean isPalindrome(String result) {
        for (int i = 0, j = result.length()-1; i < j; i++, j--) {
            if (result.charAt(i) != result.charAt(j)){
                return false;
            }
        }
        return true;
    }

    private static String getNextPalindrome(String s) {
        String mirrored = mirror(s);
        if (compare(mirrored, s) <= 0){
            mirrored = mirror(incrementFromMidle(s));
        }
        return mirrored;
    }

    private static String incrementFromMidle(String s) {
        final char[] arr = s.toCharArray();
        final int midPoint = arr.length/2;
        int currPoint = arr.length%2 == 0? midPoint-1: midPoint;
        boolean found = false;
        while (currPoint >= 0 && !found){
            char c = arr[currPoint];
            char inc = 0;
            if(c == '9'){
                inc = '0';
            }else {
                inc = (char) (c+1);
                found = true;
            }
            arr[currPoint] = inc;
            if (!found){
                currPoint--;
            }
        }
        if(!found){
            final  char[] newarr = new char[arr.length+1];
            newarr[0] = '1';
            System.arraycopy(arr, 0, newarr,1, arr.length);
            return new String(newarr);
        }else {
            return new String(arr);
        }

    }

    private static String mirror(String s) {
        final char[] arr = s.toCharArray();
        int midPoint = arr.length/2;
        int i = arr.length%2 == 0? midPoint: midPoint+1;
        while (i < arr.length){
            arr[i] = arr[midPoint-1];
            i++;
            midPoint--;
        }
        return new String(arr);
    }

    private static  int compare(String s, String t){
        final int midPoint = s.length()/2;
        int i = s.length()%2 == 0? midPoint: midPoint+1;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(i) < t.charAt(i)){
                return -1;
            } else if (s.charAt(i) > t.charAt(i)) {
                return 1;
            }
        }
        return 0;
    }
}
