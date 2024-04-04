package org.example.N_37_Functional.FunctionPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayData {
    private List<Integer> data;

    public ArrayData() {
        this.data = new ArrayList<>();

    }

    public void fillData(Integer amount){
        if (amount >= 0) {
            this.data.add((int) (Math.random() * 100)+1);
            fillData(amount-1);
        }
    }
    public ArrayData(Integer ...data){
        this.data = Arrays.asList(data);
    }

    public void add(int value) {
        this.data.add(value);
    }

    public void filterPairNumbers(){
        Predicate<Integer> isPair = x -> x%2 == 0;
        this.data = this.data.stream()
                .filter(isPair)
                .collect(Collectors.toList());
    }

    public void TransformData(Function<Integer, Integer> operation){
        // Function<Integer, Integer> square = x -> x * x;
        this.data = this.data.stream().map(operation).collect(Collectors.toList());
    }


    public void printData() {
        System.out.println("\nData: ");
        this.data.forEach(x -> System.out.print(x + " "));
    }
}
