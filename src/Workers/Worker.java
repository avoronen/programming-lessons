package Workers;

public class Worker {

    int dailypayment = 100;

    int days =10;

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

