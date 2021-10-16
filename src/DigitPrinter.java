
public class DigitPrinter {

    int number;
    int r = 0;
    int digit = 1;

    void printDigits() {

        while ((digit != r) && (number >= 1)) {

            digit = number % 10;
            number = number / 10;

            System.out.println(digit);

        }


    }

}