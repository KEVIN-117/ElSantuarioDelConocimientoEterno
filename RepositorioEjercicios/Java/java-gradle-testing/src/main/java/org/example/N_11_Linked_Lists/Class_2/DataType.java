package org.example.N_11_Linked_Lists.Class_2;

public class DataType<T> {
    private T data;
    public DataType(T item){
        this.data = item;
    }
    private static class Data<E>{
        E item;
        Data(E item) {
            this.item = item;
        }
    }
}
