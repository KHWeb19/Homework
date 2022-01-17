public class Warrior extends Adventurer { //참여 안하지만 확장성을 위해서
    final float WARRIOR_BONUS = 100;

    public Warrior () {
        super();

        warriorPromotionBonus();
    }

    public void warriorPromotionBonus () {
        pAtk += WARRIOR_BONUS;

        str += MAJOR;
        con += MAJOR;
        dex += MINOR;
        agi += MINOR;
        iq += MINOR;
        men += MINOR;
    }


}


