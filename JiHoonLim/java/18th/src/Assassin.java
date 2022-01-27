public class Assassin extends Adventurer{

    final int ASSASSIN_BONUS = 400;

    final float ASSASSIN_MAJOR_COEF = 2.8f;
    final float ASSASSIN_MINOR_COEF = 1.8f;

    public Assassin(){
        super();


        assassinPromotionBonus();
    }

    public void assassinPromotionBonus () {
        pAtk += (ASSASSIN_BONUS * ASSASSIN_MAJOR_COEF);

        //주스텟
        dex += (MAJOR * ASSASSIN_MAJOR_COEF);
        luk += (MAJOR * ASSASSIN_MAJOR_COEF);

        //부스텟
        str += (MINOR * ASSASSIN_MINOR_COEF);
        con += (MINOR * ASSASSIN_MINOR_COEF);
        iq += MINOR;
        men += (MINOR * ASSASSIN_MINOR_COEF);
    }



    public int calcDisasterStepDamage (Fenryl target){
        float sum = 0;

        final int MAX = 1;
        final int MIN = 0;

        int range = MAX - MIN + 1;
        float criticalCoef;
        int criticalFlag;

        // 크리티컬 확률
        for (int i = 0; i < 10; i++) {
            criticalFlag = (int) (Math.random() * range + MIN);
            if (criticalFlag % 2 == 0) {
                criticalCoef = 1.5f;
            } else {
                criticalCoef = 1.0f;
            }

            sum += ( criticalCoef * (12 * (pAtk - target.pDef) *
                    ( (dex - target.con) * 2.3 + (luk - target.con) * 1.5) ) );
        }

        return (int) sum;
    }

    @Override
    public int qSkill(Object obj) {
        int damage = calcDisasterStepDamage((Fenryl) obj);
        System.out.printf("%10d - 디제스터 스텝(10연격)\n",
                damage);

        return damage;
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