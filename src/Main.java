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
import Singleton.NetworkManager;
import StrategyPlusFactorDesignPattern.PaymentModes;
import StrategyPlusFactorDesignPattern.PaymentProcessor;

public class Main {
    public static void main(String[] args) {

        EmployeeComponent emp1 = new Employee("Sid", 1000.0);
        EmployeeComponent emp2 = new Employee("Kat", 700.0);

        Department depart = new Department("CP");
        depart.addMembers(emp1);
        depart.addMembers(emp2);

        emp1.displayInfo();
        System.out.println(emp1.getSalary());

        emp2.displayInfo();
        System.out.println(emp2.getSalary());

        depart.displayInfo();
        System.out.println("In total then earn: " + depart.getSalary());
    }
}
