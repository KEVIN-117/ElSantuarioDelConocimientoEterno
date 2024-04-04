package org.example.ACM;

public class A {
    public static void main(String[] args) {
        // Supongamos que Takahashi's score se almacena en una variable score
        double score = 42.0; // Reemplaza esto con la puntuación real

        // Valor objetivo y tolerancia
        double target = 42.0; // Reemplaza esto con el valor objetivo
        double tolerance = 1e-5; // 10^-5

        // Calcula el error absoluto y relativo
        double absoluteError = Math.abs(score - target);
        double relativeError = absoluteError / Math.max(target, score);

        // Imprime la puntuación de Takahashi
        System.out.println("Takahashi's score: " + score);

        // Comprueba si el error es menor o igual a la tolerancia
        System.out.println(relativeError);
        if (absoluteError <= tolerance || relativeError <= tolerance) {
            System.out.println("The answer is correct.");
        } else {
            System.out.println("The answer is incorrect.");
        }
    }
}
