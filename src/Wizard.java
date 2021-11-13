public class Wizard extends Character {

    public Wizard(int lives, int damage, int potion){

        this.lives = 10;
        this.damage = 1;
        this.potion =3;

    }

    public Wizard() {

        this.lives = 3;

    }

    public int createPotion(){

        potion++;


        return potion;
    }


}
