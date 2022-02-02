package subscriber;

public abstract class Strategy {

   abstract public int callToNumber(int lastCallDuration, String favouriteNumber);

   abstract public void useInternet(int usedTraffic);

    abstract public int pushSms(int sms);
}
