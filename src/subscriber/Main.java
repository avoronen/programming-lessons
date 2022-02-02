package subscriber;

public class Main {

    public static void main(String[] args) {

        Subscriber Ivanov = new Subscriber(new UnlimitedInternet());




        Ivanov.pushSms();
        Ivanov.callToNumber();
        Ivanov.useInternet(2);

        Subscriber Petrov = new Subscriber(new FavouriteNumber());

        Petrov.pushSms();
        Petrov.callToNumber();
        Petrov.useInternet(4);




    }
}
