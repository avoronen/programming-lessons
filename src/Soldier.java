public class Soldier {


    String name;

    Title title;

    private int value;

    public Soldier (String name, Title title ) {

        this.name = name;

        this.title = title;
    }

    public Soldier () {

    }

    public Title getTitle(){

        return title;
    }


    public void salute (Soldier soldier1) {

        if (soldier1.title.ordinal() > soldier1.title.ordinal() ) {

            System.out.println(soldier1.title + "salute" + soldier1.title);

        } else if ((soldier1.title.ordinal() == soldier1.title.ordinal())|| (soldier1.title.ordinal() < soldier1.title.ordinal())) {

            System.out.println(soldier1.title + "salute" + soldier1.title);
        }


    }
}
