package Ship;

public class TeamMember {

    int energy = Sailor.ENERGY;


    public void spendEnergy(int energy) {

        this.energy -= energy;

    }

    public void increaseEnergy(int energy) {

        this.energy += energy;
    }

}