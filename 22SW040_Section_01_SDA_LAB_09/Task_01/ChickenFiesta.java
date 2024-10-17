//  Creating Chicken Fiesta Pizza class
class ChickenFiesta implements Pizza {
    @Override
    public String getDescription() {
        return "Chicken Fiesta Pizza";
    }

    @Override
    public double getCost() {
        return 300.0;
    }
}
