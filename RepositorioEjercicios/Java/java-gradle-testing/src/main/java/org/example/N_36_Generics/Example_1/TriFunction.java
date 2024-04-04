package org.example.N_36_Generics.Example_1;

public interface TriFunction<T,U,V,R> {
    R apply(T t, U u, V v);
}
