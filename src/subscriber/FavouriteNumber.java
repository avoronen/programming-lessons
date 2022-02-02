package subscriber;


public class FavouriteNumber implements Tariff {

    @Override
    public void setCurrentTariff(Subscriber subscriber) {

        subscriber.setBalance(0);
        subscriber.setMinutes(300);
        subscriber.setSms(15);
        subscriber.setRemainTraffic(200);
        subscriber.setInternetSpeed(2);

    }

    @Override
    public void checkState(Subscriber subscriber) {

        if(subscriber.getRemainTraffic() <= 0) {

            subscriber.setInternetSpeed(1);
        }

        if(subscriber.getSms() < 0) {

            subscriber.setBalance(subscriber.getBalance() - 5);

        }

         if(subscriber.getLastCallNumber()!=null && subscriber.getLastCallNumber().equals(subscriber.getFavouriteNumber())){

             subscriber.setMinutes(subscriber.getMinutes() + subscriber.getLastCallDuration());

         } else if(subscriber.getMinutes() < 0) {

             subscriber.setBalance(subscriber.getBalance() - subscriber.getLastCallDuration());
         }

    }
}
