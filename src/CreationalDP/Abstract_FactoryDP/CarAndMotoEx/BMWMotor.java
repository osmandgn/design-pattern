package CreationalDP.Abstract_FactoryDP.CarAndMotoEx;

public class BMWMotor implements Motor{

    private String type;
    private double price;

    public BMWMotor(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
