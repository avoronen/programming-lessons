import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        int a = scanner.nextInt();

        if ((a > 0) && (a < 65278)) {
            char symbol = (char) a;
            System.out.println(a);

        } else {
            System.out.println("Error");
        }


    }

}