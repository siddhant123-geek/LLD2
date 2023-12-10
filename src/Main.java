
import ForDemo.Comparator;
import ForDemo.Employee;
import ObserverDesignPattern.Customer;
import ObserverDesignPattern.DeliveryPartner;
import ObserverDesignPattern.Order;
import ProtoTypeDesignPattern.Project;
import ProtoTypeDesignPattern.ProjectProtoType;
import SingletonDesignPattern.PaymentGatewayManager;

import java.awt.*;
import java.lang.reflect.Field;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
////        Project p1 = new Project("Sample Project", 2);
////        p1.display();
////
////        ProjectProtoType p2 = p1.clone();
////        p2.display();
//
//        PaymentGatewayManager p1 = PaymentGatewayManager.getInstance();
//
//        PaymentGatewayManager p2 = PaymentGatewayManager.getInstance();
//
//        System.out.println(p1.equals(p2));

        Order o = new Order();
        Customer c = new Customer("Sid");
        DeliveryPartner dp = new DeliveryPartner("P");

        o.attachObserver(c);
        o.attachObserver(dp);
        o.setStatus("Order assigned");

        o.detachObserver(dp);
        o.setStatus("Delivered");
    }
}
