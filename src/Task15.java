public class Task15 {

    public static void main(String[] args) {

        double[][] array = new double[3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                array[i][j] = Math.random() * 100;

                System.out.print(array[i][j] + " ");


            }
            System.out.println();
        }

        double max = array[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > max) {

                    max = array[i][j];


                }

            }
        }
        System.out.println(max);
    }

}
