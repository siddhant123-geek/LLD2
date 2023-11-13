package DecoratorDesignPattern;

public class Pizza implements FoodItem {
    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double getPrice() {
        return 300.0;
    }
}
