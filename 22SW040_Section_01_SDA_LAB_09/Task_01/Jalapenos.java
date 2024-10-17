// Creating Jalapenos topping
class Jalapenos extends PizzaDecorator {
    public Jalapenos(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Jalapenos";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 40.0;
    }
}
