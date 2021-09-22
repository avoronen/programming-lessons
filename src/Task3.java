import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = scanner.nextInt();

        int x = number%2;
        if (x == 0) {
            System.out.println("результат – четное число");
        } else {
            System.out.println("результат - нечетное число");
        }


    }


}
