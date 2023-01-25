package BehavioralDP.ObserverDP;

public class Observer {

    public static void main(String[] args) {
        Observer observer = new Observer();
        observer.observerDemo();

    }

    void observerDemo(){

        Channel channel1 = new NewsChannel();
        Channel channel2 = new NewsChannel();
        Channel channel3 = new NewsChannel();

        NewsAgency agency = new NewsAgency();

        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);

        agency.sendNews(" Java dili artık TechPro ile çok daha kolay");
        agency.sendNews(" Spring Boot artık kolay");
        agency.sendNews(" Spring Security saç beyazlatır");

        System.out.println("Channel 1 Haberleri : ");
        channel1.printNews();
        System.out.println("**********************");
        System.out.println("Channel 2 Haberleri : ");
        channel2.printNews();
        System.out.println("**********************");
        System.out.println("Channel 3 Haberleri : ");
        channel3.printNews();
    }
}
