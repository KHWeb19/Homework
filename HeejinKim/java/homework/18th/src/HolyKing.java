public class HolyKing extends Adventurer {

    final int HOLYKING_BONUS = 300;


    final float SNIPER_MAJOR_COEF = 2.3f;
    final float SNIPER_MINOR_COEF = 1.8f;

    public HolyKing() {
        super();

        holyKingPromotionBonus();
    }

    public void holyKingPromotionBonus () {
        mAtk += (HOLYKING_BONUS * SNIPER_MAJOR_COEF);

        str += MINOR;
        con += (MINOR * SNIPER_MINOR_COEF);
        dex += MINOR;
        agi += (MINOR * SNIPER_MINOR_COEF);
        iq += (MAJOR * SNIPER_MAJOR_COEF);
        men += (MAJOR * SNIPER_MAJOR_COEF);
    }


    public void ultimateRaze () {
        System.out.println("죽은 아군 전원 부활");
    }

    @Override
    public int qSkill(SelectedCharacter monsterSc) {
        dcro.procDamageCalcRequestObject(monsterSc);

        System.out.println("얼티메이트 레이즈");
        ultimateRaze();

        return 0;
    }


}


