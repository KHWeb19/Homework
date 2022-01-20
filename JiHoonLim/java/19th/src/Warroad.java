public class Warroad extends Warrior{
    // 워로드 특수 능력 anger
    protected int anger;

    final float WARROAD_MAJOR_COEF = 1.5f;
    final float WARROAD_MINOR_COEF = 1.2f;

    // 전사 1차 전직 워로드
    public Warroad(){
        super();

        warroadPromotionBonus();

        anger = 0;
    }

    public void warroadPromotionBonus(){
        pAtk += (WARRIOR_BONUS + WARROAD_MAJOR_COEF);

        // 주스텟
        str += (MAJOR * WARROAD_MAJOR_COEF);
        con += (MAJOR * WARROAD_MAJOR_COEF);

        //부스텟
        luk += MINOR;
        dex += (MINOR * WARROAD_MINOR_COEF);
        iq += MINOR;
        men += (MINOR * WARROAD_MINOR_COEF);
    }


    // 전직으로 인한 스킬 업데이트
    public void EnergyOfNellasia(){
        System.out.println("5초간 모든 데미지에 면역(상태 이상 면역)");
    }
    @Override
    public int qSkill(Object obj) {
        //super.qSkill();  --> 스킬 계승 X
        System.out.printf("넬라의 기운(버프) \n");
        EnergyOfNellasia();

        return 0;
    }


    /*
    public int calcChargeStingerDmg(Fenryl target){
        return (int) (20 * mAtk * str * 0.6 + dex *  0.2);
    }
    @Override
    public void wSkill(Object obj) {
        System.out.printf("%10d - 차지 스팅거(분노 게이지 20 사용, 범위기)\n",
                calcChargeStingerDmg((Fenryl) obj));
    }

     */
}
