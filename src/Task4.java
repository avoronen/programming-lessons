import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int z = 0;


        System.out.println("Введите число:");

        Scanner in = new Scanner(System.in);

        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();

        double div1 = a % 2;
        double div2 = b % 2;
        double div3 = c % 2;

        if (div1 != 0){
            z++;
        }
        if (div2 != 0) {
            z++;
        }

        if (div3 != 0) {
            z++;
        }

        System.out.println(z);
    }

}