// Main Class CoffeeOrder

public class CoffeeOrder {
    public static void main(String[] args) {
        // Create a basic Espresso coffee
        Coffee coffee = new Espresso();
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());

        // Add Milk to the coffee
        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());

        // Add Sugar to the coffee
        coffee = new Sugar(coffee);
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());

        // Add Whipped Cream to the coffee
        coffee = new WhippedCream(coffee);
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());
    }
}
