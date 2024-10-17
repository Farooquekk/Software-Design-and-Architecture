// Creating Peppy Paneer  class


class PeppyPaneer implements Pizza {
    @Override
    public String getDescription() {
        return "Peppy Paneer Pizza";
    }

    @Override
    public double getCost() {
        return 200.0;
    }
}
