public class Hunter extends Adventurer{

    final float Hunter_MAJOR_COEF = 3.5f;
    final float Hunter_MINOR_COEF = 1.5f;

    final int HUNTER_BONUS = 500;


    public Hunter(){
        super();

        hunterPromotionBonus();

    }

    public void hunterPromotionBonus(){
        pAtk += (HUNTER_BONUS * Hunter_MAJOR_COEF);

        // 주스텟
        dex += (MAJOR * Hunter_MAJOR_COEF);
        luk += (MAJOR * Hunter_MAJOR_COEF);

        //부스텟
        con += (MINOR * Hunter_MINOR_COEF);
        str += (MINOR * Hunter_MINOR_COEF);
        iq += MINOR;
        men += MINOR ;
    }


    // 전직으로 인한 스킬 업데이트
    public int calcBurstShotDamage (Fenryl target) {
        return (int) (5 * (pAtk - target.pDef) *
                ( (dex - target.con) * 1.5 + (luk - target.con) * 1.2) );
    }

    @Override
    public int qSkill(Object obj) {
        int damage = calcBurstShotDamage((Fenryl) obj);
        System.out.printf("%10d - 버스트 샷(원거리)\n",
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
