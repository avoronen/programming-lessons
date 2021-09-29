import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        int a = scanner.nextInt();

        if ((a > 0) && (a <= 4)) {
            System.out.println("Первый интервал");

        } else if ((a > 5) && (a < 11)) {
            System.out.println("Второй интервал");

        } else {
            System.out.println("Ошибка");

        }

            }

        }
