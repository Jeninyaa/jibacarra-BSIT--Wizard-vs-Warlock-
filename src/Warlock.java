public class Warlock extends Character {
    Warlock(String name){
        super(name);
    }


        //Attacking Skills
    public void Poison (Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Poison (Damage - 40)");
        int damagePoints = 70;
        int manaCost = 60;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };

    public void attackFlyingKick (Character enemyCharacter){
        System.out.println(super.characterName + "attacks " + enemyCharacter.characterName + " with Attack FlyingKick (Damage - 40)");
        int damagePoints = 60;
        int manaCost = 500;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    


    //Health and Mana Regeneration
    public void healthRejuvenation (){
        System.out.println(super.characterName + " generated 10% Health Points and Mana");
        addHealth_Mana();
    }   
}