package ObserverDesign;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int id;
    private String name;
    private String status;

    private List<Observer> observers = new ArrayList<>();

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
        this.status = "Placed";
    }

    public void setStatus(String newStatus) {
        status = newStatus;

        notifyObservers();
    }

    public void attach(Observer ob) {
        observers.add(ob);
    }

    public void detach(Observer ob) {
        observers.remove(ob);
    }

    public void notifyObservers() {
        for(Observer ob: observers) {
            ob.update(this);
        }
    }
}
