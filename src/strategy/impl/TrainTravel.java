package strategy.impl;

import strategy.TravelStrategy;

public class TrainTravel implements TravelStrategy {
    @Override
    public void travel() {
        System.out.println("Traveling by Train. Balanced speed and cost.");
    }
}
