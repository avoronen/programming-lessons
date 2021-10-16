import java.util.Random;

public class Main18 {

    public static void main(String[] args) {

        int z = 4;
        int summath = 0;
        int sumrus = 0;
        Random random = new Random();

        Student[] students = new Student[5];


            for (int i = 0; i < 5; i++) {
            students[i] = new Student();
            students[i].id = random.nextInt(4);
            students[i].math = random.nextInt(5);
            students[i].russian = random.nextInt(5);

            summath += students[i].math;
            sumrus += students[i].russian;


            System.out.println("Student:" + students[i].id);
            System.out.println((students[i].math + students[i].russian) / 2);



        }

        System.out.println();

        System.out.println(summath / 5);
        System.out.println(sumrus / 5);
    }

}
