public class Assassin extends Adventurer {

    final int ASSASSIN_BONUS = 400;

    // coefficient(계수)의 약자로 COEF 사용
    final float ASSASSIN_MAJOR_COEF = 2.8f;
    final float ASSASSIN_MINOR_COEF = 1.8f;

    public Assassin() {
        super();

        assassinPromotionBonus();
    }

    public void assassinPromotionBonus() {
        pAtk += (ASSASSIN_BONUS * ASSASSIN_MAJOR_COEF);

        str += (MINOR * ASSASSIN_MINOR_COEF);
        con += (MINOR * ASSASSIN_MINOR_COEF);
        dex += (MAJOR * ASSASSIN_MAJOR_COEF);
        agi += (MAJOR * ASSASSIN_MAJOR_COEF);
        iq += MINOR;
        men += (MINOR * ASSASSIN_MINOR_COEF);
    }
}