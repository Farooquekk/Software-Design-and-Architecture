// Creating class Whipped Cream as a condiment
class WhippedCream extends CoffeeDecorator {
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 30.0;
    }
}
