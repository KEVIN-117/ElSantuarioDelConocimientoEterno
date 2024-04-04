package org.example.N_30_AdvancedAlgorithms;

import java.util.Arrays;

public class MoveCerosToFinal {
    public static int[] moveCeros(int[] nums) {
        int aux;
        int p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                aux = nums[p1];
                nums[p1] = nums[i];
                nums[i] = aux;
                p1++;
            }
        }
        return  nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveCeros(new int[]{1,0,1})));

        System.out.println(Arrays.toString(moveCeros(new int[]{0,1,0,3,12})));
    }
}
