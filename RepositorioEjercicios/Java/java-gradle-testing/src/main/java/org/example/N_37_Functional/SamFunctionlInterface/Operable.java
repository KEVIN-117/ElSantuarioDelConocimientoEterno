package org.example.N_37_Functional.SamFunctionlInterface;

/**
 * @FunctionalInterface
 * @param <T>
 * @param <R>
 */
@FunctionalInterface
public interface Operable <T, R>{
    /**
     * @param t
     * @param u
     * @param v
     * @return R
     */
    R apply(T t, T u, T v);
}
