package Ship;

public class Repairman extends TeamMember implements Sailor  {

    public void work(Ship ship) {

        ship.sternStrength += 5;
        spendEnergy(3);

    }


}
