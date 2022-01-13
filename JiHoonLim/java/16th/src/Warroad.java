public class Warroad extends Warrior{
    // 워로드 특수 능력 anger
    private int anger;

    // 전사 1차 전직 워로드
    public Warroad(){
        super();

        strUpdate(MAJOR);
        conUpdate(MAJOR);

        lukUpdate(MINOR);
        dexUpdate(MINOR);
        iqUpdate(MINOR);
        menUpdate(MINOR);
    }


    // 전직으로 인한 스킬 업데이트
    public void EnergyOfNellasia(){
        System.out.println("5초간 모든 데미지에 면역(상태 이상 면역)");
    }
    @Override
    public void qSkill() {
        //super.qSkill();  --> 스킬 계승 X
        System.out.printf("넬라의 기운(버프) \n");
        EnergyOfNellasia();
    }


    public int calcChargeStingerDmg(){
        return (int) (20 * getpAtk() * getStr() * 0.6 + getDex() *  0.2);
    }
    @Override
    public void wSkill() {
        System.out.printf("%10d - 차지 스팅거(분노 게이지 20 사용, 범위기)\n", calcChargeStingerDmg());
    }
}
