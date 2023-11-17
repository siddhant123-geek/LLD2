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
import Calculator.CalculatorFactory;
import Calculator.CalculatorType;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CalculatorFactory calculatorFactory = new CalculatorFactory();
        Calculator calculator1 = calculatorFactory.getCalculator(CalculatorType.NORMAL);

        System.out.println(calculator1.add(2, 3));
        System.out.println(calculator1.sub(5, 2));

        Calculator calculator2 = calculatorFactory.getCalculator(CalculatorType.SCIENTIFIC);
        System.out.println(calculator2.add(2, 3));
        System.out.println(calculator2.sub(5, 2));
        System.out.println(((ScientificCalculator) calculator2).modulo(3, 5));
    }
}
