
package Workers;

public class Workerofoccupationalhazard extends Worker {

    int extrapayment;

    public Workerofoccupationalhazard(int extrapayment, int dailypayment) {

        this.extrapayment = extrapayment;
        this.dailypayment = dailypayment;
    }

    public Workerofoccupationalhazard() {

    }

    @Override
    public void calculateSalary() {

        int Salary = dailypayment * days + extrapayment;

        System.out.println(Salary);


    }

}
