import CommandDesignPattern.*;
import CompositeDesignPattern.Department;
import CompositeDesignPattern.Employee;
import CompositeDesignPattern.EmployeeComponent;
import DecoratorDesignPattern.*;
import ObjectAdapterDesignPattern.AnalyticsTool;
import ObjectAdapterDesignPattern.JsonAnalyticsTool;
import ObjectAdapterDesignPattern.XMLtoJsonAdapter;
import ObserverDesign.Customer;
import ObserverDesign.DeliveryPartner;
import ObserverDesign.Observer;
import ObserverDesign.Order;
import ProxyDesignPattern.Image;
import ProxyDesignPattern.ProxyImage;
import Singleton.NetworkManager;
import StrategyPlusFactorDesignPattern.PaymentModes;
import StrategyPlusFactorDesignPattern.PaymentProcessor;

public class Main {
    public static void main(String[] args) {

        Image proxy = new ProxyImage("sample_image");

        proxy.display();

        proxy.display();
    }
}
