package org.example.N_37_Functional.SamFunctionlInterface;

/**
 * @FunctionalInterface
 * @param <T>
 * @param <U>
 * @param <V>
 * @param <R>
 */
@FunctionalInterface
public interface TernaryRunnable<T, U, V, R> {
    /**
     * @param t
     * @param u
     * @param v
     * @return R
     */
    R apply(T t, U u, V v);
}
