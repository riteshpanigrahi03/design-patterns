package facade;

// Facade Class - OnlineShoppingFacade
class OnlineShoppingFacade {
    private InventoryManager inventoryManager;
    private PaymentProcessor paymentProcessor;
    private ShippingService shippingService;

    public OnlineShoppingFacade() {
        this.inventoryManager = new InventoryManager();
        this.paymentProcessor = new PaymentProcessor();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String product, double amount, String address) {
        // Simplified order placement using subsystems
        inventoryManager.checkProductAvailability(product);
        paymentProcessor.processPayment(amount);
        shippingService.shipProduct(product, address);

        System.out.println("Order placed successfully.");
    }
}
