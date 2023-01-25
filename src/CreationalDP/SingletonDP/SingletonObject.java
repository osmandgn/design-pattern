package CreationalDP.SingletonDP;

public class SingletonObject {

    String message = "MERHABA" ;

    private static SingletonObject instance = new SingletonObject();

    private SingletonObject() {};

    public static SingletonObject getInstance() {
        return instance;
    }

    public void changeMessage() {
        this.message = this.message + " Batch 104-105-114";
    }
}
