import ObserverDesign.Customer;
import ObserverDesign.DeliveryPartner;
import ObserverDesign.Observer;
import ObserverDesign.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(123,"Laptop");

        Observer ob1 = new Customer();
        Observer ob2 = new DeliveryPartner();

        order.attach(ob1);
        order.attach(ob2);

        order.setStatus("Out for delivery");

        order.detach(ob2);

        order.setStatus("Delivered");
    }
}
