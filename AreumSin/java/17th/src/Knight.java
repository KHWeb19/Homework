public class Knight extends Warrior{

    private  int anger;

    public Knight(){
        super();

        StrUpdate(MAJOR);
        ConUpdate(MAJOR);
        DexUpdate(MINOR);
        AgiUpdate(MINOR);
        IqUpdate(MINOR);
        MenUpdate(MINOR);

        anger = 0;
    }

    public void absoluteBlessing(){
        System.out.println("5초간 모든 데미지에 면역(상태 이상 면역)");
    }

    public int calcCutOffSlashDamage(){
        return (int)( 20 * (getmAtk() * getIq() * 0.6 + getDex() * 0.2));
    }

    @Override
    public void qSkill() {
        // 자동 완성 기능을 사용하면 super()을 부르고 있음
        // 보통 게임을 하게 되면 전직 했어도 이전 클래스의 기술을 사용할 수있음.
        // super를 통해 이전 클래스의 스킬을 계승할 수 있음.
        // super를 안쓰고 새로운 스킬로 덮어쓰는것임.

        // 계승을 못하도록 한것임.
        //super.qSkill();
        System.out.printf("절대자의 가호(버프)\n");
        absoluteBlessing();
    }

    @Override
    public void wSkill() {
        //super.wSkill();
        //범위기 뭐지..?
        System.out.printf("%10d - 일도양단(분노 게이지 10 사용): 범위기\n",calcCutOffSlashDamage());
    }
}
