public class Wizard extends Magician {
    protected int boost;

    final float WIZARD_MAJOR_COEF = 1.35f;
    final float WIZARD_MINOR_COEF = 1.3f;

    public Wizard () {
        super();

        wizardPromotionBonus();

        boost = 0;
    }

    public void wizardPromotionBonus () {
        mAtk += (MAGICIAN_BONUS * WIZARD_MAJOR_COEF);

        str += MINOR;
        con += (MINOR * WIZARD_MINOR_COEF);
        dex += MINOR;
        agi += (MINOR * WIZARD_MINOR_COEF);
        iq += (MAJOR * WIZARD_MAJOR_COEF);
        men += (MAJOR * WIZARD_MAJOR_COEF);
    }

    // 음수가 나오는건 보스몹 방어력과 스탯이 높아 딜이 안들어감
    // 이 경우는 -가 아닌 데미지 0으로 표기하도록 한다.
    public int calcSuperGravityFieldDamage (DamageCalcRequestObject dcro) {
        return (int) (100 * (5.5 * mAtk - dcro.getmDef()) * (iq - dcro.getMen()) * 1.1);
    }

    @Override
    public int qSkill(SelectedCharacter monsterSc) {

        dcro.procDamageCalcRequestObject(monsterSc);


        int damage = calcSuperGravityFieldDamage(dcro);

        System.out.printf("%10d - 초중력(단일기 - boost 게이지 50 사용)\n",
                damage);

        return damage;
    }


}


