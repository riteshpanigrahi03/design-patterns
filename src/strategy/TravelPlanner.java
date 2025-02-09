package strategy;

public class TravelPlanner {
    private TravelStrategy travelStrategy;

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void executeTravel() {
        if (travelStrategy == null) {
            throw new IllegalStateException("Travel strategy not set!");
        }
        travelStrategy.travel();
    }
}
