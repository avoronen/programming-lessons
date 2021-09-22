import java.util.Scanner;

public class Task4<a, b, c, div1, div2, div3> {
    public static void main(String[] args) {
        int z = 0;
        int y = 0;

        System.out.println("Введите число:");

        Scanner in = new Scanner(System.in);

        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();

        double div1 = a % 2;
        double div2 = b % 2;
        double div3 = c % 2;

        if ((div1 != 0)|(div2 != 0)|(div3 != 0)) {
            z = ++y;
       // } if ((div1 == 0)&&(div2 != 0)&&  (div3 == 0)){
           // z = b++;
       // } if ((div1 == 0)&&(div2 != 0)&&  (div3 != 0)) {
         //   z = c++;
        }


        System.out.println(z);
    }

}