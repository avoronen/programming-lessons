import java.util.Scanner;

public class Task5 {
    public static void main (String[] args){
        System.out.println("Введите число:");

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if ((a>b)&&(a>c)) {
            System.out.println(a);
        } else if((b>a)&&(b>c)) {
            System.out.println(b);
        } else if ((c>a)&&(c>b)){
             System.out.println(c);
            }
        }

    }



