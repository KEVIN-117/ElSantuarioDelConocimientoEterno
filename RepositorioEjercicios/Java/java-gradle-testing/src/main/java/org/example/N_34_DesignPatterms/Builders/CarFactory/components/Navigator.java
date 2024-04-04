package org.example.N_34_DesignPatterms.Builders.CarFactory.components;

public class Navigator {
    private String route;

    public Navigator(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
