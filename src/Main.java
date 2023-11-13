import CommandDesignPattern.*;
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

        FoodItem pizzaOrder = new Pizza();
        FoodItem burgerOrder = new Burger();

        pizzaOrder = new CheeseDecorator(pizzaOrder, 20.0);
        pizzaOrder = new ToppingsDecorator(pizzaOrder, 30);

        burgerOrder = new ToppingsDecorator(burgerOrder, 30);
        burgerOrder = new CheeseDecorator(burgerOrder, 15);

        System.out.println("Description of Pizza order " + pizzaOrder.getDescription());
        System.out.println("Price of Pizza order " + pizzaOrder.getPrice());


        System.out.println("Description of Burger order " + burgerOrder.getDescription());
        System.out.println("Price of Burger order " + burgerOrder.getPrice());
    }
}
