public class Warrior extends Character {



    public Warrior(int lives, int damage, int potion){

        this.lives = 10;
        this.damage = 1;
        this.potion = 3;

    }

    public Warrior(){

        this.lives = 3;


    }

    void useWeapon(){

        this.damage = damage +5;
        
    }
}
