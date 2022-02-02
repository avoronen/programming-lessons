package Ship;

public class Сannoneer extends TeamMember implements Sailor {


    public void work(Ship ship) {

        ship.loadedCannon += 7;
        spendEnergy(3);
    }







}
