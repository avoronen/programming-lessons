
import java.util.Random;

public class Main19 {


    public static void main(String[] args) {

        String[] workers = {"Ivanov Ivan Ivanovich","Petrov Petr Petrovich","Sidorov Sidor Sidorovich"};

        int[] wage = {10,20,30};

        int time;

        Random random = new Random();

            time = random.nextInt(8);

            for (int i = 0; i < 3; i++) {

                int salary = wage[i] * time;

                System.out.println(workers[i]);

                System.out.println(salary);
            }


        }
    }


