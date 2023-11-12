package StrategyPlusFactorDesignPattern;

public class CashPayment implements PaymentStrategy {
    @Override
    public void doPayment() {
        System.out.println("Making payment with Cash");
    }
}
