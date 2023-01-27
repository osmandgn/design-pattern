package CreationalDP.Abstract_FactoryDP.CarAndMotoEx;

public interface IFactory {
    Car createCar(String color, double price);
    Motor createMotor(String type, double price);
}
