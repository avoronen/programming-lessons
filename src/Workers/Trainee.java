package Workers;

public class Trainee extends Worker {

    int decreasingCoefficient;

    public Trainee (int decreasingCoefficient, int dailypayment) {

        this.decreasingCoefficient = decreasingCoefficient;

        this.dailypayment = dailypayment;

        if (decreasingCoefficient > 1) {

            System.out.println("понижающий коэффициент задан неправильно!");

        }

    }


    @Override
    public void calculateSalary(int days) {

        int Salary = dailypayment * days * decreasingCoefficient;

        System.out.println(Salary);

        super.calculateSalary(5);


    }


}
