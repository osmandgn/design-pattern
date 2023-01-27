package CreationalDP.Abstract_FactoryDP.CarAndMotoEx;

public class BMWFactory implements IFactory{
    @Override
    public Car createCar(String color, double price) {
        return new BMWCar(color, price);
    }

    @Override
    public Motor createMotor(String type, double price) {
        return new BMWMotor(type, price);
    }
}
