package StrategyPlusFactorDesignPattern;

public class PaymentProcessor {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentModes paymentMode) {
        if(paymentStrategy != null) {
            paymentStrategy = null;
        }
        paymentStrategy = PaymentGatewayFactory.getPaymentStrategy(paymentMode);
    }

    public void makePayment() {
        if(paymentStrategy != null) {
            paymentStrategy.doPayment();
        }
        else {
            System.out.println("PaymentStrategy not set");
        }
    }
}
