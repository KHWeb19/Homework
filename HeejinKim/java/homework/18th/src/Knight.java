public class Knight extends Warrior {
    protected int anger;


    final float KNIGHT_MAJOR_COEF = 1.5f;
    final float KNIGHT_MINOR_COEF = 1.2f;

    public Knight() {
        super();

        knightPromotionBonus();

        anger = 0;
    }

    public void knightPromotionBonus() {
        pAtk += (WARRIOR_BONUS * KNIGHT_MAJOR_COEF);

        str += (MAJOR * KNIGHT_MAJOR_COEF);
        con += (MAJOR * KNIGHT_MAJOR_COEF);
        dex += (MINOR * KNIGHT_MINOR_COEF);
        agi += MINOR;
        iq += MINOR;
        men += (MINOR * KNIGHT_MINOR_COEF);
    }

    public void absoluteBlessing() {

        System.out.println("5초간 모든 데미지에 면역(상태 이상 면역)");
    }

    @Override
    public int qSkill(SelectedCharacter monsterSc) {

        System.out.printf("절대자의 가호(버프)\n");
        absoluteBlessing();

        return 0;
    }
}



