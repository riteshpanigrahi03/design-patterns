package decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee();
        printInvoice(basicCoffee);
        Coffee basicCoffeeWithExtraMilk = new MilkDecorator(basicCoffee);
        printInvoice(basicCoffeeWithExtraMilk);
        Coffee basicCoffeeWithExtraMilkAndSugar = new SugarDecorator(new MilkDecorator(basicCoffee));
        printInvoice(basicCoffeeWithExtraMilkAndSugar);


    }

    private static void printInvoice(Coffee coffee) {
        System.out.println("Order:" + coffee.getDescription());
        System.out.println("Cost:" + coffee.getCost());
        System.out.println("--------");
    }
}
