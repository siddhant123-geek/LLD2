package StrategyPlusFactorDesignPattern;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void doPayment() {
        System.out.println("Making payment using Crypto");
    }
}
