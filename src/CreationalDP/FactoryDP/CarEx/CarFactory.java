package CreationalDP.FactoryDP.CarEx;

public class CarFactory {

    public static Car carCreator(String brand, String color, double price){
        if (brand.equals("Audi")){
            return new Audi(color, price);
        }else if(brand.equals("BMW")){
            return new BMW(color, price);
        }else return null;
    }


}
