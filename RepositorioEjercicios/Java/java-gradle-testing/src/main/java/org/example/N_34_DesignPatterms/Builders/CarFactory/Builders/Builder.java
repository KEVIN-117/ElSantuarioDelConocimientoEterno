package org.example.N_34_DesignPatterms.Builders.CarFactory.Builders;

import org.example.N_34_DesignPatterms.Builders.CarFactory.Cars.Type;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Engine;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Navigator;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.Transmission;
import org.example.N_34_DesignPatterms.Builders.CarFactory.components.TripComputer;

public interface Builder {
    void setCarType(Type type);
    void setSeats(Integer seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setNavigator(Navigator navigator);
}
