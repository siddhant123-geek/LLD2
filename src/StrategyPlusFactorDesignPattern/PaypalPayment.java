package StrategyPlusFactorDesignPattern;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void doPayment() {
        System.out.println("Making payment through Paypal");
    }
}
