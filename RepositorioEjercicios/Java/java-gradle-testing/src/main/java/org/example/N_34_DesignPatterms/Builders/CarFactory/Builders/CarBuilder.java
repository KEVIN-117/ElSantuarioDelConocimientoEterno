package org.example.N_34_DesignPatterms.Builders.CarFactory.Builders;

import org.example.N_34_DesignPatterms.Builders.CarFactory.Cars.Type;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Engine;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Navigator;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Transmission;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.TripComputer;

public class CarBuilder implements Builder{
    private Type type;

    private Integer seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private Navigator navigator;


    /**
     *
     */
    @Override
    public void setCarType(Type type) {
        this.type = type;
    }

    /**
     * @param seats
     */
    @Override
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    /**
     * @param engine
     */
    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * @param transmission
     */
    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    /**
     * @param tripComputer
     */
    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    /**
     * @param navigator
     */
    @Override
    public void setNavigator(Navigator navigator) {
        this.navigator = navigator;
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
