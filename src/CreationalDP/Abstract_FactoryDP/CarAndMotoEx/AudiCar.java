package CreationalDP.Abstract_FactoryDP.CarAndMotoEx;

public class AudiCar implements Car{

    private String color;
    private double price;

    public AudiCar(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public void getColor() {
        System.out.println("Your Audi Color is " + color);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
