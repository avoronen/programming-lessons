import java.util.Random;

public class Main20 {

    public static void main(String[] args) {

        Shop[] shops = new Shop[20];
        Random random = new Random();
        String[] name = {"a", "b", "c","d", "e", "f", "g", "h", "i", "j", "k", "l","m", "n", "o", "p", "q", "r", "s","t"};

        int sumbenefit = 0;

        for (int i = 0; i < 20; i++) {
            shops[i] = new Shop();

            shops[i].benefit = random.nextInt(100);

            sumbenefit += shops[i].benefit;


            System.out.println("Shop:" + name[i]);
            System.out.println(shops[i].benefit);




        }

        System.out.println(sumbenefit);
    }

}
