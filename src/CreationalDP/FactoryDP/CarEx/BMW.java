package CreationalDP.FactoryDP.CarEx;

public class BMW implements Car {

    private String color;
    private double price;

    public BMW(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public void getColor() {
        System.out.println("Your BMW Color is " + color);
    }

    @Override
    public double getPrice() {
        return price;
    }
}