package org.example.N_34_DesignPatterms.Builders;

import org.example.N_34_DesignPatterms.Builders.CarFactory.Builders.CarBuilder;
import org.example.N_34_DesignPatterms.Builders.CarFactory.Builders.ManualBuilder;
import org.example.N_34_DesignPatterms.Builders.CarFactory.Cars.Car;
import org.example.N_34_DesignPatterms.Builders.CarFactory.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        System.out.println("Car built:\n" +builder);


        ManualBuilder manualBuilder = new ManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        System.out.println("\nCar manual built:\n" + manualBuilder);
    }
}
