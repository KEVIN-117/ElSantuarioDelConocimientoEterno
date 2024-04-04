package org.example.N_34_DesignPatterms.Builders.CarFactory.Cars;

import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Engine;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Navigator;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Transmission;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.TripComputer;

public class Car {
    private final Type type;
    private final Integer seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final Navigator navigator;

    private Double fuel;

    public Type getType() {
        return type;
    }

    public Integer getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public Navigator getNavigator() {
        return navigator;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    public Car(Type type, Integer seats, Engine engine, Transmission transmission, TripComputer tripComputer, Navigator navigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null){
            this.tripComputer.setCar(this);
        }
        this.navigator = navigator;
        this.fuel = 0.0;
    }
}
