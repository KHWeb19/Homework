public class Warrior extends Adventurer {
    final float WARRIOR_BONUS = 100;

    public Warrior() {
        super();

        warriorPromotionBonus();
    }

    public void warriorPromotionBonus() {
        pAtk += WARRIOR_BONUS;

        str += MAJOR;
        con += MAJOR;
        dex += MINOR;
        agi += MINOR;
        iq += MINOR;
        men += MINOR;
    }
}