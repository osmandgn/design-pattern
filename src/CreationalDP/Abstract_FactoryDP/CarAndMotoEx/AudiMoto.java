package CreationalDP.Abstract_FactoryDP.CarAndMotoEx;

public class AudiMoto implements Motor{
    private String type;
    private double price;

    public AudiMoto(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String getType() {
        return "Audi Moto";
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
