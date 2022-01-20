public class Wizard extends Adventurer{
    final float WIZARD_BONUS = 80;

    //마법사
    public Wizard(){
        super();

        wizardPromotionBonus();
    }

    public void wizardPromotionBonus(){
        mAtk += WIZARD_BONUS;

        // 주스텟
        iq += MAJOR;
        men += MAJOR;

        //부스텟
        luk += MINOR;
        dex += MINOR;
        str += MINOR;
        con += MINOR;
    }

     /*
    public int calcChainLightningDamage () {
        return (int) (mAtk * iq * 2.5);
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 체인 라이트닝(원거리)\n",
                calcChainLightningDamage());
    }

    public int calcFrostNovaDamage () {
        return (int) (mAtk * iq * 0.25);
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 프로스트 노바(광범위): 범위 슬로우\n",
                calcFrostNovaDamage());
    }
     */
}
