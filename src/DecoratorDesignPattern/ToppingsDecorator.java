package DecoratorDesignPattern;

public class ToppingsDecorator extends Decorator {
    private double toppingsPrice;

    public ToppingsDecorator(FoodItem item, double price) {
        super(item);
        this.toppingsPrice = price;
    }


    @Override
    public String getDescription() {
        return foodItem.getDescription() + " with extra toppings";
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + toppingsPrice;
    }
}
