public class Supporter extends Adventurer {

    final int Supporter_BONUS = 300;

    // coefficient(계수)의 약자로 COEF 사용
    final float Supporter_MAJOR_COEF = 2.3f;
    final float Supporter_MINOR_COEF = 1.8f;

    public Supporter() {
        super();

        supporterPromotionBonus();
    }

    public void supporterPromotionBonus () {
        mAtk += (Supporter_BONUS * Supporter_MAJOR_COEF);

        //주스텟
        iq += (MAJOR * Supporter_MAJOR_COEF);
        men += (MAJOR * Supporter_MAJOR_COEF);

        //부스텟
        str += MINOR;
        con += (MINOR * Supporter_MINOR_COEF);
        dex += MINOR;
        luk += (MINOR * Supporter_MINOR_COEF);

    }

    // 향후 리팩토링이 필요하겠지만 우선 Object는 무조건 Fenryl로 취급하도록 하자!
    //public int calcBurstShotDamage (Object target) {
    public void ultimateRaze () {
        System.out.println("죽은 아군 전원 부활");
    }

    @Override
    public int qSkill(Object obj) {
        System.out.println("얼티메이트 레이즈");
        ultimateRaze();

        return 0;
    }

    /*
    public int calcCutOffSlashDamage () {
        return (int) (20 * mAtk * (str * 0.6 + dex * 0.2));
    }

    @Override
    public void wSkill(Object obj) {
        System.out.printf("%10d - 일도양단(범위기 - 분노 게이지 20 사용)\n",
                calcCutOffSlashDamage((Fenryl) obj));
    }
     */
}
