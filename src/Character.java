public class Character {

    int lives;
    int damage;
    int potion;

    public int doDamage(Character person) {

        person.lives = lives - damage;

        return lives;
    }

    public int healCharacter(){

        this.lives = lives +1;
        potion = potion--;

        return lives;

    }





}
