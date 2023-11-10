import CommandDesignPattern.*;
import ObserverDesign.Customer;
import ObserverDesign.DeliveryPartner;
import ObserverDesign.Observer;
import ObserverDesign.Order;

public class Main {
    public static void main(String[] args) {
//        Order order = new Order(123,"Laptop");
//
//        Observer ob1 = new Customer();
//        Observer ob2 = new DeliveryPartner();
//
//        order.attach(ob1);
//        order.attach(ob2);
//
//        order.setStatus("Out for delivery");
//
//        order.detach(ob2);
//
//        order.setStatus("Delivered");

        Image im1 = new Image();

        ActionListenerCommand command1 = new OpenAction(im1);
        ActionListenerCommand command2 = new SaveAction(im1);


        MenuOptions menus = new MenuOptions();
        menus.addToMenu(command1);
        menus.addToMenu(command2);

        menus.executeCommands();
    }
}
