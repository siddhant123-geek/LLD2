package DecoratorDesignPattern;

public class CheeseDecorator extends Decorator {

    private double extraCheesePrice;

    public CheeseDecorator(FoodItem item, double price) {
        super(item);
        this.extraCheesePrice = price;
    }


    @Override
    public String getDescription() {
        return foodItem.getDescription() + " with extra cheese";
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + extraCheesePrice;
    }
}
