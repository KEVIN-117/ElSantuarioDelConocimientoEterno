package org.example.ACM.Contest_588310;

import java.util.HashMap;
import java.util.Scanner;

public class A_ContestResult {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n,m;
        while (s.hasNext()){
            n = s.nextInt();
            m = s.nextInt();
            for (int i = 0; i < n; i++) {
                map.put(i+1, s.nextInt());
            }
            int acum = 0;
            for (int i = 0; i < m; i++) {
                acum += map.get(s.nextInt());
            }

            System.out.println(acum);
        }
    }
}
