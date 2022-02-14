import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду: ");

        String newLine = scanner.nextLine();

        String[] arguments = newLine.split(" ");

        if (arguments[0].equals("ls")) {

            File file = new File("C:/newFile.txt");

        } else if(arguments[0].equals("cr")) {

            File file = new File ("C:/folder/newFile.txt");
        }


    }

}

