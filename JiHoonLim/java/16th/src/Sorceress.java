public class Sorceress extends Wizard{
    // 소서리스로 전직하며 부스터 게이지 생성
    private int boost;

    public Sorceress(){
        super();

        iqUpdate(MAJOR);
        menUpdate(MAJOR);

        strUpdate(MINOR);
        conUpdate(MINOR);
        lukUpdate(MINOR);
        dexUpdate(MINOR);

        boost = 0;
    }


    // 소서리스 전직으로 인한 스킬 업데이트
    public int calcReverseGravityDmg(){
        return (int) (100 * getmAtk() * getIq() * 1.1);
    }
    @Override
    public void qSkill() {
        //super.qSkill();  --> 스킬 계승 X
        System.out.printf("%10d - 리버스 그라비티(단일기 - boost 게이지 50 사용) \n",
                calcReverseGravityDmg());

    }


    public int calcExplorationDmg(){
        return (int) (20 * getmAtk() * getIq() * 0.7 );
    }
    @Override
    public void wSkill() {
        System.out.printf("%10d - 익스플로젼(범위기 - boost 게이지 20 사용)\n",
                calcExplorationDmg());
    }


    // 상황 표시를 위한 프린트 ( 스텟 , 경험치 등)
    public void printInfo(){
        System.out.printf("hp: %d, mp: %d, " + "\n" +
                        "str: %d, con: %d, dex: %d, luk: %d, iq: %d, men: %d, " + "\n" +
                        "lv: %d, exp: %d / %d\n",
                (int)getHp(), (int)getMp(),
                (int)getStr(), (int)getCon(), (int)getDex(),
                (int)getLuk(), (int)getIq(), (int)getMen(),
                getLv(), getCurExp(), getReqExp());
    }
}
