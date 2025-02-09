package strategy.impl;

import strategy.TravelStrategy;

public class BusTravel implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("Traveling by Bus. It is cheap but slow.");
    }
}
