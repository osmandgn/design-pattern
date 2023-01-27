package CreationalDP.FactoryDP.CarEx;

class Audi implements Car {
    private String color;
    private double price;

    public Audi(String color, double price){
        this.color = color;
        this.price = price;
    }

    @Override
    public void getColor() {
        System.out.println("Your AUDi Color is " + color);

    }

    @Override
    public double getPrice() {
        return price;
    }
}