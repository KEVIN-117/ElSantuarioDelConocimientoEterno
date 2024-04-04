package org.example.ClashOfClans;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago(
                "cualquiera",
                "De area",
                "tererestres y aereos",
                4,
                16
        );
        System.out.println(mago.getVelocidad());
    }
}
