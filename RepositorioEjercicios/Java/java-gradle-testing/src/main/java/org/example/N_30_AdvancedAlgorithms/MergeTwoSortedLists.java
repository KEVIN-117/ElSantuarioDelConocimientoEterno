package org.example.N_30_AdvancedAlgorithms;

import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLists {
    public static int[] mergeTwoSortedLists(int[] list1, int m, int[] list2, int n) {
        int pointerOne = m+n-1;
        int pointerTwo = m-1;
        int pointerThree = n-1;
        while (pointerOne >= 0 && pointerTwo >= 0 && pointerThree >= 0){
            if (list2[pointerThree] > list1[pointerTwo]){
                list1[pointerOne] = list2[pointerThree];
                pointerThree--;
            } else if (list2[pointerThree] < list1[pointerTwo]) {
                list1[pointerOne] = list1[pointerTwo];
                pointerTwo--;
            } else if (list2[pointerThree] == list1[pointerTwo]) {
                list1[pointerOne] = list2[pointerThree];
                pointerTwo--;
            }
            pointerOne--;
        }
        if (pointerOne >= 0 && pointerThree >= 0){
            list1[pointerOne] = list2[pointerThree];
        }
        System.out.println(Arrays.toString(list1));
        return list1;
    }

    public static void main(String[] args) {
        int[] list1 = {1,2,3,0,0,0};
        int m1 = 3;
        int n1 = 3;
        int[] list2 = {2,5,6};
        mergeTwoSortedLists(list1,m1,  list2, n1);
        int[] nums1 = {1,2,3,0,0,0,0};
        int m = 3;
        int[] nums2 = {-4,2,3,9};
        int n = 4;
        mergeTwoSortedLists(nums1, m, nums2, n);
    }
}
