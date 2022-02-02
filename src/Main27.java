public class Main27 {

    public static void main(String[] args) {

        Soldier[] soldier1 = new Soldier[7];

        for (int i = 0; i<7; i++) {

            soldier1[i] = new Soldier();
        }


        soldier1[0].title = Title.PRIVATE;
        soldier1[1].title = Title.SERGEANT;
        soldier1[2].title = Title.LIEUTENANT;
        soldier1[3].title = Title.MAJOR;
        soldier1[4].title = Title.COLONEL;
        soldier1[5].title = Title.GENERAL;
        soldier1[6].title = Title.SERGEANT;

        for (int i = 0; i < 7; i++) {

            soldier1[i].name = "Soldier" + i;
        }

        Title[] titles = Title.values();

        for (Title t:titles) {


            System.out.println(t);

            for (int i = 0;  i < 7; i++) {

                if (soldier1[i].title == t) {

                    System.out.println(soldier1[i].name);
                }
            }

        }
              {

        }



















    }
}
