package org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.Singleton;

public class Singleton implements Comparable<Singleton>{
    private static Singleton intance = null;
    private String name;
    private Singleton(String name){
        this.name = name;
    }

    public static Singleton getInstance(String name){
        if(intance == null){
            Singleton.intance = new Singleton(name);
        }
        return Singleton.intance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Singleton o) {
        return o.compareTo(this);
    }
}
