package org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.Singleton;

public class Client {

    public Client(){
    }

    public Singleton changeName(String name){
        return Singleton.getInstance("Singleton using Client class");
    }
}
