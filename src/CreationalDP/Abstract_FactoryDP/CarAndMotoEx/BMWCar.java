package CreationalDP.Abstract_FactoryDP.CarAndMotoEx;

public class BMWCar implements Car{

    private String color;
    private double price;

    public BMWCar(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public void getColor() {
        System.out.println("Your BMW Color is " + color);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
