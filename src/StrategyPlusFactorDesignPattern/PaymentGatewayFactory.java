package StrategyPlusFactorDesignPattern;

public class PaymentGatewayFactory {

    private PaymentStrategy paymentStrategy;

    public static PaymentStrategy getPaymentStrategy(PaymentModes paymentMode) {
        if(paymentMode == PaymentModes.Paypal) {
            return new PaypalPayment();
        }
        else if(paymentMode == PaymentModes.Cash) {
            return new CashPayment();
        }
        else {
            return new CryptoPayment();
        }
    }
}
