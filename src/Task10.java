import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        char operation = scanner.next().charAt(0);


        switch(operation) {

            case '+' :
                System.out.println(firstNumber + secondNumber);

                break;

            case '-' :
                System.out.println(firstNumber - secondNumber);

                break;

            default :
                System.out.println("Ошибка");
        }




    }




}
