public class Task2 {
    public static void main(String[] args) {

        int x = 121;

        int y = x ^ 2 + x * 21 - 4;

        int z = y % 2;

        System.out.println(y);

        if (z == 0) {
            System.out.println("результат – четное число");

        }


    }

}


