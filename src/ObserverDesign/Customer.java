package ObserverDesign;

public class Customer implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("Order updated as observed by customer");
    }
}
