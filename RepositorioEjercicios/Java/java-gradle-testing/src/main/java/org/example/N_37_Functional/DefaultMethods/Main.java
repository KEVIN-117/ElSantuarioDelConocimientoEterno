package org.example.N_37_Functional.DefaultMethods;

public class Main {
    public static void main(String[] args) {
        StringOperation operation = () -> 5;
        operation.operate("Hello");
    }

    @FunctionalInterface
    interface StringOperation{
        int getAmount();


        default void operate(String text){
            int x = getAmount();
            while (x-- > 0){
                System.out.println(text);
            }
        }
    }
}
