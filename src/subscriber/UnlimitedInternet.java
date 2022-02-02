package subscriber;

public class UnlimitedInternet implements Tariff{

    @Override
    public void setCurrentTariff(Subscriber subscriber) {

        subscriber.setBalance(0);

        subscriber.setMinutes(200);

        subscriber.setSms(10);

        subscriber.setRemainTraffic(0);

        subscriber.setInternetSpeed(1);

    }

    @Override
    public void checkState(Subscriber subscriber) {

        subscriber.setRemainTraffic(0);

        if(subscriber.getSms() < 0) {

            subscriber.setBalance(subscriber.getBalance() - 5);

        }

    if(subscriber.getMinutes() < 0) {

        subscriber.setBalance(subscriber.getBalance() - (subscriber.getLastCallDuration() * 2));
    }

    }
}
