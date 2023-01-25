package StructuralDP.DecoratorDP;

public class PhoneDecorator implements Phone{

    protected Phone basicPhone;

    /// *********** Const.


    public PhoneDecorator(IPhone basicPhone) {
        this.basicPhone = basicPhone;
    }

    @Override
    public String getName() {
        return basicPhone.getName(); // Iphone
    }

    @Override
    public int cameraCount() {
        return basicPhone.cameraCount(); // 2
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice(); // 7999.9
    }
}
