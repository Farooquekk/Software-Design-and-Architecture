// Main --> PizzaStore Class

public class PizzaStore {
    public static void main(String[] args) {
        // Create a plain Peppy Paneer pizza
        Pizza pizza = new PeppyPaneer();
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        // Add Cheese topping
        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        // Add Olives topping
        pizza = new Olives(pizza);
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        // Add Jalapenos topping
        pizza = new Jalapenos(pizza);
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());
    }
}
