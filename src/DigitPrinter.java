
public class DigitPrinter {

    int digit = 1;

    void printDigits(int number) {

        while ((number > 0)) {

            digit = number % 10;
            number = number / 10;

            System.out.println(digit);

        }


    }

}