public class Main25 {

    public static void main(String[] args) {

        Character character = new Warrior();

        character.healCharacter();


        Character magician = new Wizard();

        character.doDamage(character);
        character.healCharacter();



        Warrior warrior = new Warrior();
        warrior.useWeapon();


        Wizard wizard = new Wizard();
        wizard.createPotion();
        //wizard.doDamage();

    }


}