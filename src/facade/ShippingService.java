package facade;

class ShippingService {
    public void shipProduct(String product, String address) {
        System.out.println("Shipping " + product + " to " + address);
    }
}
