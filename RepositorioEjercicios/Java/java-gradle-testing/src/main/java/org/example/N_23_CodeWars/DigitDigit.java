package org.example.N_23_CodeWars;

public class DigitDigit {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(squareDigits(number));
    }
    public static int squareDigits(int n) {
        // TODO Implement me
        //int[] integerList = new int[String.valueOf(n).length()];
        String result = "";
        int index = 0;
        while(n != 0){
            //integerList[index] = ;
            result = result+(int) Math.pow(n%10, 2);
            index++;
            n = n / 10;
        }
        int result2 = Integer.parseInt(result);
        String r = "";
        while(result2 != 0){
            //integerList[index] = ;
            r += result2%10;
            result2 /=10;
        }
        return Integer.parseInt(r);
    }
}
