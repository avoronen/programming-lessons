package Ship;



public class Ship {

    int loadedCannon = 100;
    int sternStrength;
    Sailor[] team;


    private static Ship instance;

    private Ship() {

    }





    public Ship getInstance() {

        if(instance == null) {

            instance = new Ship();

        }
        return instance ;

    }

    public void getFire(){

        loadedCannon -= 5;

        System.out.println("Корабль открыл огонь. Количество заряженных пушек  " + loadedCannon);

    }

    public void move() {

        for (int i = 0; i < team.length; i++) {

            team[i].spendEnergy(5);
        }




    }

    public void getDamage(int damage, int sternStrength) {

        this.sternStrength -= damage;

        return;



    }

    public void makeTeamWork() {

        //team[i].work(this);





    }

}
