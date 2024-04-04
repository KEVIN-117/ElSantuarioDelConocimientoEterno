package org.example.N_16Examples_SIS_211;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[][] arrayChar = new String[n][n];
        System.out.println(arrayChar.length);
        System.out.println(arrayChar[0].length);
        for (int i = 0; i < arrayChar.length ; i++) {
            for (int j = 0; j <arrayChar[i].length ; j++) {
                arrayChar[i][j] = input.next();
            }
        }
        String word = input.next();
        System.out.println(fun(arrayChar, word));

    }
    static String fun(String[][] matrix, String word){
        String starWord = "";
        String endWord = "";
        String[] wordsArray = word.split("");
        int indexCounter  = 0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals(wordsArray[indexCounter])){
                    int row = i;
                    int colum = j;
                    starWord = row + "," + colum;
                    indexCounter++;
                    if (matrix[row][colum+1].equals(wordsArray[indexCounter])){
                        indexCounter++;
                        colum ++;
                    }
                    if (matrix[row+1][colum].equals(wordsArray[indexCounter])){
                        indexCounter++;
                        row++;
                    }
                    if (indexCounter == word.length()){
                        endWord = row + "," + colum;
                    }
                }
            }
        }
        return starWord + ","+ endWord;
    }
}
