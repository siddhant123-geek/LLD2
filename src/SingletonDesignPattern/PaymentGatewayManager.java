package SingletonDesignPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PaymentGatewayManager {

    private PaymentGatewayManager() {
        System.out.println("PaymentGatewayManager initialized");
    }

    private static PaymentGatewayManager instance;

    private static Lock mtx = new ReentrantLock();

    public static PaymentGatewayManager getInstance() {
        if(instance == null) {
            mtx.lock();
            try {
                if(instance == null) {
                    instance = new PaymentGatewayManager();
                }
            }
            finally {
                mtx.unlock();
            }

        }
        return instance;
    }
}
