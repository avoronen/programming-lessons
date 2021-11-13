package Workers;

public class Worker {

    int dailypayment;

    int days;

    public Worker() {

    }

    public Worker (int dailypayment){

        this.dailypayment = dailypayment;

    }


    public void calculateSalary() {
        int Salary = dailypayment * days;

        System.out.println(Salary);


    }
}

