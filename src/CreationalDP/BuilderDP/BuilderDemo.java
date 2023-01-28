package CreationalDP.BuilderDP;

public class BuilderDemo {
    public static void main(String[] args) {
        Person person1 = new Person.Builder().name("Osman").surname("Dogan").address("Istanbul").build();
        Person person2 = new Person.Builder().name("Ali").address("Turkiye").build();
    }
}
