// Creating Farmhouse Pizza class
class Farmhouse implements Pizza {
    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }

    @Override
    public double getCost() {
        return 250.0;
    }
}
