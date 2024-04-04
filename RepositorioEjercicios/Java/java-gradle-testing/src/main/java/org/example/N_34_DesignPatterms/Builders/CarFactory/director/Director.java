package org.example.N_34_DesignPatterms.Builders.CarFactory.director;

import org.example.N_34_DesignPatterms.Builders.CarFactory.Builders.Builder;
import org.example.N_34_DesignPatterms.Builders.CarFactory.Cars.Type;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Engine;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Navigator;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Transmission;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(Type.SPORT_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setNavigator(new Navigator("221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London"));
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(Type.ELECTRIC_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setNavigator(new Navigator("221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London"));
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(Type.CUV_CROSSOVER);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setNavigator(new Navigator("221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London"));
    }
}
