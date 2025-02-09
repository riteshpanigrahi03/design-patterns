package strategy.impl;

import strategy.TravelStrategy;

public class CarTravel implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("Traveling by Car. It is fast but expensive.");
    }
}
