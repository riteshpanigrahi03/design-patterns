package facade;

// Client Code
public class WithFacadeExample {
    public static void main(String[] args) {
        // With Facade, the client can place an order with just one method call
        OnlineShoppingFacade shoppingFacade = new OnlineShoppingFacade();
        shoppingFacade.placeOrder("Laptop", 1200.0, "456 Oak St");
    }
}
