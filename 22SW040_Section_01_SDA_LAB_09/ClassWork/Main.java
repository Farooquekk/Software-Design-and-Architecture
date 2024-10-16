

public class Main {
    public static void main(String[] args) {
        Car car =  new BasicCar();
        car.assemble();

         car = new SportsCar(car);
         car.assemble();

         car = new LuxuryCar(car);
         car.assemble();
    }
}
