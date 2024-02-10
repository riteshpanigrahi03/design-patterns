package decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + " with extra Sugar";
    }

    public double getCost() {
        return super.getCost() + 1.0;
    }
}
