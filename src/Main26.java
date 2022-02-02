

import java.util.Scanner;

public class Main26 {

    public static void main(String[] args) throws NonTwoDigitNumberException, NotRightFormatException, OtherLengthException {

            System.out.println("Введите число:");

            Scanner sc = new Scanner(System.in);

            String number = sc.nextLine();

            double res = Counting.calculateExpression(number);

            System.out.println(res);

        }
    }






