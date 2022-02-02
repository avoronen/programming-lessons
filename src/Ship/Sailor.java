package Ship;

public interface Sailor {

    int ENERGY = 100;

    void work(Ship ship);

    void spendEnergy(int energy);

    void increaseEnergy(int energy);


}
