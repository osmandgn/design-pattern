package CreationalDP.Abstract_FactoryDP.CarAndMotoEx;

public class RunnerClass {
    public static void main(String[] args) {
        IFactory audiFactory = new AudiFactory();
        Car car1 = audiFactory.createCar("Red", 99.9);
        Motor moto1 = audiFactory.createMotor("Speed", 19.9);

        IFactory bmwFactory = new BMWFactory();
        Car car2 = bmwFactory.createCar("Yellow", 77.8);
        Motor moto2 = bmwFactory.createMotor("Mountain", 56.9);

        car1.getColor();
        car2.getColor();

        System.out.println("**********************");

        System.out.println(moto1.getType());
        System.out.println(moto2.getType());

    }
}
