package Ship;

public class Cook extends TeamMember implements Sailor {

    public void work(Ship ship) {
        for (int i = 0; i < ship.team.length; i++) {
            ship.team[i].increaseEnergy(5);

        }

    }


}
