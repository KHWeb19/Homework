public class Magician extends Adventurer {
    final float MAGICIAN_BONUS = 80;

    public Magician() {
        super();

        magicianPromotionBonus();
    }

    public void magicianPromotionBonus() {
        mAtk += MAGICIAN_BONUS;

        str += MINOR;
        con += MINOR;
        dex += MINOR;
        agi += MINOR;
        iq += MAJOR;
        men += MAJOR;
    }
}