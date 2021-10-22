import java.util.Random;

public class Main22 {

    public static void main(String[] args) {

        Circle[] circles = new Circle[4];

        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            circles[i] = new Circle(random.nextInt(10));

            System.out.println("Радиус " + circles[i].r);

            circles[i].showSquare();

            System.out.println();

        }







    }




    }

