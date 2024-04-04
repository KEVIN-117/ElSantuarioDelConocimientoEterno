package org.example.N_34_DesignPatterms.Builders.CarFactory.components;

import org.example.N_34_DesignPatterms.Builders.CarFactory.Cars.Car;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel(){
        System.out.println("Fuel level "+ this.car.getFuel() );
    }

    public void showStatus(){
        if (this.car.getEngine().getIsStarted()){
            System.out.println("Card is stareted");
        }else {
            System.out.println("Car isn't started");
        }
    }
}
