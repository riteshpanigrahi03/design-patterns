package strategy;

import strategy.impl.BusTravel;
import strategy.impl.CarTravel;
import strategy.impl.TrainTravel;

public class StrategyClient {
    public static void main(String[] args) {
        TravelPlanner planner = new TravelPlanner();

        // Choosing Car as the travel mode
        planner.setTravelStrategy(new CarTravel());
        planner.executeTravel();

        // Switching to Bus
        planner.setTravelStrategy(new BusTravel());
        planner.executeTravel();

        // Switching to Train
        planner.setTravelStrategy(new TrainTravel());
        planner.executeTravel();
    }
}
/*
Traveling by Car. It is fast but expensive.
Traveling by Bus. It is cheap but slow.
Traveling by Train. Balanced speed and cost.
 */
