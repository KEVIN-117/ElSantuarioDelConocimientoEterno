package org.example.N_21_Threads;

import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int saveCounter = 1;
        int saveNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            int counter = 0;
            int number = 0;
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]){
                    counter++;
                    number = numbers[i];
                }
            }
            if (counter > saveCounter && number != saveNumber){
                arrayList.add(counter);
                map.put(numbers[i], counter);
                saveNumber = number;
            }
        }
        int maxCounter = 0;
        for (int i = 0; i < arrayList.size() ; i++) {
            maxCounter = (arrayList.get(i) > maxCounter)? arrayList.get(i) : maxCounter;
        }
        int finalMaxCounter = maxCounter;
        map.entrySet().forEach((entry) ->{
            System.out.println((finalMaxCounter == entry.getValue())? entry.getKey():"");
        });
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
    }

}
