public class Sorceress extends Wizard{
    final float SORCERESS_MAJOR_COEF = 1.35f ;
    final float SORCERESS_MINOR_COEF = 1.3f ;

    // 소서리스로 전직하며 부스터 게이지 생성
    protected int boost;

    public Sorceress(){
        super();

        sorceressPromotionBonus();

        boost = 0;
    }

    public void sorceressPromotionBonus(){
        mAtk += (WIZARD_BONUS * SORCERESS_MAJOR_COEF);

        // 주스텟
        iq += (MAJOR  * SORCERESS_MINOR_COEF);
        men += (MAJOR  * SORCERESS_MINOR_COEF);

        //부스텟
        luk += (MINOR  * SORCERESS_MINOR_COEF);
        dex += MINOR;
        str += MINOR;
        con += (MINOR  * SORCERESS_MINOR_COEF);
    }


    // 소서리스 전직으로 인한 스킬 업데이트
    public int calcSuperGravityFieldDamage(Fenryl target){
        return (int) (100 * (5.5 * mAtk - target.mDef) * (iq - target.men) * 1.1);
    }
    @Override
    public int qSkill(Object obj) {
        //super.qSkill();  --> 스킬 계승 X
        int damage = calcSuperGravityFieldDamage((Fenryl) obj);
        System.out.printf("%10d - 초중력(단일기 - boost 게이지 50 사용) \n",
                damage);

        return damage;

    }


   /*
    public int calcAltemaDamage (Fenryl target) {
        return (int) (20 * mAtk * iq * 0.7);
    }

    @Override
    public void wSkill(Object obj) {
        System.out.printf("%10d - 알테마(범위기 - boost 게이지 20 사용)\n",
                calcAltemaDamage((Fenryl) obj));
    }
     */
}
