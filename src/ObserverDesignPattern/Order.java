package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int id;
    private String status;
    private List<Observer> observers = new ArrayList<>();

    public void setStatus(String newStatus) {
        status = newStatus;
        notifyObservers();
    }

    public String getStatus() {
        return status;
    }

    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for(Observer ob: observers) {
            ob.update(this);
        }
    }
}
