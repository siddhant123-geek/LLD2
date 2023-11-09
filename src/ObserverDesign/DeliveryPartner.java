package ObserverDesign;

public class DeliveryPartner implements Observer{
    @Override
    public void update(Order order) {
        System.out.println("Order updated as observed by Delivery Partner");
    }
}
