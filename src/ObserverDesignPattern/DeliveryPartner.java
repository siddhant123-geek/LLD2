package ObserverDesignPattern;

public class DeliveryPartner implements Observer {

    private String name;

    public DeliveryPartner(String name) {
        this.name = name;
    }
    @Override
    public void update(Order order) {
        System.out.println("Order status is " + order.getStatus() + " delivery partner" + name + " notified");
    }
}
