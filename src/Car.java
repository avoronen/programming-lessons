
public class Car {

    static int tankVolume = 100;

    double remainingFuel;



    public Car() {

        this.remainingFuel = tankVolume;
    }

    double spendFuel(double spendedFuel) {

        this.remainingFuel -= spendedFuel;

        return remainingFuel;

    }

    void showRemainingFuel() {

        System.out.println(remainingFuel);


    }

  static void showTankVolume() {

        System.out.println(tankVolume);




    }









}
