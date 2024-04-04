package org.example.N_34_DesignPatterms.Builders.CarFactory.components;

public class Engine {
    private final Double volume;
    private Integer mileAge;
    private Boolean isStarted;

    public Engine(Double volume, Integer mileAge) {
        this.volume = volume;
        this.mileAge = mileAge;
        this.isStarted = false;
    }

    public void on(){
        this.isStarted = true;
    }
    public void off(){
        this.isStarted = false;
    }

    public Boolean getIsStarted(){
        return this.isStarted;
    }

    public void go(Integer mileAge){
        if (isStarted){
            this.mileAge += mileAge;
        }else {
            System.out.println("No puedo avanzar, primero debes encender el motor");
        }
    }

    public Double getVolume(){
        return this.volume;
    }

    public Integer getMileAge(){
        return this.mileAge;
    }
}
