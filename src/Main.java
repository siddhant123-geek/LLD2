import Calculator.Calculator;
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

import java.security.Timestamp;
import java.util.Timer;
import Calculator.ScientificCalculator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculator calculator1 = new Calculator();

        System.out.println(calculator1.add(2, 3));
        System.out.println(calculator1.sub(5, 2));

        Calculator calculator2 = new ScientificCalculator();
        System.out.println(calculator2.add(2, 3));
        System.out.println(calculator2.sub(5, 2));
        System.out.println(((ScientificCalculator) calculator2).modulo(3, 5));
    }
}
