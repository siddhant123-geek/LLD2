import CommandDesignPattern.*;
import ObserverDesign.Customer;
import ObserverDesign.DeliveryPartner;
import ObserverDesign.Observer;
import ObserverDesign.Order;
import Singleton.NetworkManager;

public class Main {
    public static void main(String[] args) {

        NetworkManager networkManager1 = NetworkManager.getInstance();
        NetworkManager networkManager2 = NetworkManager.getInstance();

        if(networkManager1 == networkManager2) {
            System.out.println("Both the instances are same");
            System.out.println(Thread.currentThread().getName());
        }
        else {
            System.out.println("Singleton has failed");
        }
    }
}
