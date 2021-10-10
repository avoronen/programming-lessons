import java.sql.SQLOutput;

public class Task14 {
    public static void main(String[] args) {

        long number = 1235;
        long r = 0;
        long digit = 1;


        while ((digit != r) && (number >= 1)) {

            digit = number % 10;
            number = number / 10;

            System.out.println(digit);


        }

    }

}



