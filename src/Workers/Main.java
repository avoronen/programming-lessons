package Workers;


public class Main {

    public static void main(String[] args) {

        Worker workers = new Worker();

        Workerofoccupationalhazard hazard = new Workerofoccupationalhazard();

        Trainee trainee = new Trainee();

        workers.dailypayment = 100;
        workers.days = 10;

        hazard.dailypayment = 100;
        hazard.days = 10;
        hazard.extrapayment = 300;

        trainee.dailypayment = 50;
        trainee.days = 10;
        trainee.decreasingCoefficient = 1;

      workers.calculateSalary();
      hazard.calculateSalary();
      trainee.calculateSalary();


        // Worker[] workers = new Worker[4];

       // Worker days;
       // Worker dailypayment;
        //Worker extrapayment;
        //Worker decreasingCoefficient;


        //workers[0] = new Worker (dailypayment, days);

        //workers[1] = new Workerofoccupationalhazard(dailypayment, extrapayment, days);

       // workers[2] = new Trainee(dailypayment, days, decreasingCoefficient);




    }


}
