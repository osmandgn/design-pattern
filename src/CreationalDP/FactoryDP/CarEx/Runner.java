package CreationalDP.FactoryDP.CarEx;

public class Runner {
    public static void main(String[] args) {
        Car car = CarFactory.carCreator("BMW", "Red", 999.99);
        car.getColor();

    }
}
