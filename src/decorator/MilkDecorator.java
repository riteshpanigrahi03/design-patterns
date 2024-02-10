package decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + " with extra Milk";
    }

    public double getCost() {
        return super.getCost() + 3.5;
    }
}
