package subscriber;

 public class Subscriber  {

    private int balance;

    public int getBalance() {

        return balance;
    }

    public int setBalance(int balance) {

        this.balance = balance;

        return balance;
    }

    private int minutes;

    public int getMinutes() {

        return minutes;
    }

    public int setMinutes(int minutes) {

        this.minutes = minutes;

        return minutes;
    }


    private int sms;

    public int getSms() {

        return sms;
    }

    public int setSms(int sms) {

        this.sms = sms;

        return sms;
    }


    private int remainTraffic;

    public int getRemainTraffic() {

        return remainTraffic;
    }

    public int setRemainTraffic(int remainTraffic) {

        this.remainTraffic = remainTraffic;

        return remainTraffic;
    }

    private int internetSpeed;

    public int getInternetSpeed() {

        return internetSpeed;
    }

    public int setInternetSpeed(int internetSpeed) {

        this.internetSpeed = internetSpeed;

        return internetSpeed;
    }
    private String favouriteNumber;

    public String getFavouriteNumber() {

        return favouriteNumber;
    }

    public String setFavouriteNumber() {

        this.favouriteNumber = favouriteNumber;

        return favouriteNumber;
    }

    private int lastCallDuration;

    public int getLastCallDuration() {

        return lastCallDuration;
    }

    public int setLastCallDuration(int lastCallDuration) {

        this.lastCallDuration = lastCallDuration;

        return lastCallDuration;
    }


    private String lastCallNumber;

    public String getLastCallNumber() {

        return lastCallNumber;
    }

    public String setLastCallNumber() {

        this.lastCallNumber = lastCallNumber;

        return lastCallNumber;
    }





    Tariff currentTariff;

    public Subscriber(Tariff newTariff) {

        this.currentTariff = newTariff;

        currentTariff.setCurrentTariff(this);


    }



    public int pushSms() {

        this.sms = sms - 1;

        if (sms < 1) {

            System.out.println("Лимит превышен");
        } else {

            System.out.println("Количество смс:" + sms);
        }

        currentTariff.checkState(this);
        return sms;

    }



    public int callToNumber() {

        System.out.println("Вызов совершен");

        this.minutes -= lastCallDuration;
        this.lastCallNumber = lastCallNumber;

        this.lastCallDuration = lastCallDuration;

        currentTariff.checkState(this);

        return minutes;

    }


    public void useInternet(int usedTraffic) {
        System.out.println("Интернет использован");

        usedTraffic -= remainTraffic;

        currentTariff.checkState(this);







    }
}
