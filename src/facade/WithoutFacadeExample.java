package facade;

// Client Code
public class WithoutFacadeExample {
    public static void main(String[] args) {
        // Without Facade, the client needs to interact with each subsystem individually
        InventoryManager inventoryManager = new InventoryManager();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        ShippingService shippingService = new ShippingService();

        inventoryManager.checkProductAvailability("Smartphone");
        paymentProcessor.processPayment(500.0);
        shippingService.shipProduct("Smartphone", "123 Main St");
    }
}
