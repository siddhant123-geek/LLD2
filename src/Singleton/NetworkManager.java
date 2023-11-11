package Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NetworkManager {

    private NetworkManager() {
        System.out.println("NetworkManager initialized");
    }

    private static NetworkManager instance;

    private static Lock mtx = new ReentrantLock();

    public static NetworkManager getInstance() {
        if(instance == null) {
            mtx.lock();
            try {
                if(instance == null) { // Double-checked locking
                    instance = new NetworkManager();
                }
            }
            finally {
                mtx.unlock();
            }
        }

        return instance;
    }
}
