import CommandDesignPattern.*;
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

        String xmlData = "data";
        // Without the adapter
        JsonAnalyticsTool jsonAnalyticsTool = new JsonAnalyticsTool();
        jsonAnalyticsTool.setJsonData(xmlData);
        jsonAnalyticsTool.analyse();

        System.out.println("-------------------------------------------");

        AnalyticsTool analyticsTool = new XMLtoJsonAdapter(xmlData);
        analyticsTool.analyseData();
    }
}
