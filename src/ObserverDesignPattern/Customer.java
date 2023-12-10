package ObserverDesignPattern;

public class Customer implements Observer {

    private String name;
    public Customer(String name) {
        this.name = name;
    }
    @Override
    public void update(Order order) {
        System.out.println("Order has been " + order.getStatus() + " customer " + name + " notified");
    }
}
