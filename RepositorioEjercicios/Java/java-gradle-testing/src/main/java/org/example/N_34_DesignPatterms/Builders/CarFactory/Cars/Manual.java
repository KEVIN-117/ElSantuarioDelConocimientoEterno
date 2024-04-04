package org.example.N_34_DesignPatterms.Builders.CarFactory.Cars;

import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Engine;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Navigator;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Transmission;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.TripComputer;

public class Manual {
    private final Type type;
    private final Integer seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final Navigator navigator;

    public Manual(Type type, Integer seats, Engine engine, Transmission transmission, TripComputer tripComputer, Navigator navigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.navigator = navigator;
    }

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

    @Override
    public String toString() {
        String info = "";
        info += "Type of car: " + type + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileAge() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.navigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
