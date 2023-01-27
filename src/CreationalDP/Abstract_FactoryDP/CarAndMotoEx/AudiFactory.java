package CreationalDP.Abstract_FactoryDP.CarAndMotoEx;

public class AudiFactory implements IFactory{
    @Override
    public Car createCar(String color, double price) {
        return new AudiCar(color, price);
    }

    @Override
    public Motor createMotor(String type, double price) {
        return new AudiMoto(type, price);
    }
}
