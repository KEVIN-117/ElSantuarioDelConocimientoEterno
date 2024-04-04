package org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.Singleton;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Client client2 = new Client();
        Singleton s1 = Singleton.getInstance("Singleton using Main class");
        Singleton s2 = client.changeName("Singleton using Client class");

        System.out.println(s1.getClass().getName());
        System.out.println(s1.getName());
        System.out.println(s2.getName());
        System.out.println(Objects.compare(s2, s1, Singleton::compareTo));
        System.out.println(s1 == s2);
        System.out.println(client.equals(client2));
    }
}
