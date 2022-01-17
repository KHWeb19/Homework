public class Adventurer implements Skill {
    //기본 스텟 (phy atk, mag atk, hp, mp, phy def, mag def
    //                    ,str(힘), dex(재주), luk(민첩), iq(지능) , men(정신) , cont(체력)
    //                    , exp(경험치) , lv(레벨)


    // 기본 스텟 변수
    protected float pAtk , mAtk;
    protected float pDef , mDef;
    protected float hp , mp;
    protected float str , dex , luk, iq , con, men;
    protected int lv;
    protected int reqExp;
    protected int curExp;


    // 기본 스텟 변수 초기화
    final float PATK = 50;
    final float MATK = 50;
    final float HP = 100;
    final float MP = 100;
    final float PDEF = 1;
    final float MDEF = 1;
    final int STR = 10;
    final int DEX = 10;
    final int IQ = 10;
    final int LUK = 10;
    final int MEN = 10;
    final int CON = 10;
    final int LV = 1;
    final int REQEXP = 100;
    final int CUREXP = 0;

    final int MAJOR = 1000;
    final int MINOR = 500;

    // 소서리스 번호 지정
    final int SOCERESS = 3;


    public Adventurer(){
        pAtk = PATK;
        mAtk = MATK;
        hp = HP;
        mp = MP;
        pDef = PDEF;
        mDef = MDEF;
        str = STR;
        dex = DEX;
        iq = IQ;
        luk =LUK;
        men = MEN;
        con = CON;
        lv = LV;
        reqExp = REQEXP;
        curExp = CUREXP;

    }

    //여기서부터 공격 및 스킬
    public int calcAtkDmg(Fenryl target){
        return (int)(pAtk * (str + 0.3 * dex));
    }
    @Override
    public int Attack(Object obj) {
        System.out.printf("%10d - 기본공격\n" ,
                calcAtkDmg((Fenryl) obj));

        return 0;
    }


    public int calcQSkillDmg(Fenryl target){
        return (int)(pAtk * (0.6 * str + 0.3 * dex));
    }
    @Override
    public int qSkill(Object obj) {
        System.out.printf("%10d - 돌던지기\n",
                calcQSkillDmg((Fenryl) obj));

        return 0;
    }

    public int calcWSkillDmg(Fenryl target){
        return (int) (mAtk * (1.2 * iq) + pAtk * (0.5 * str));
    }
    @Override
    public int wSkill(Object obj) {
        System.out.printf("%10d - 마나볼\n", calcWSkillDmg((Fenryl) obj));

        return 0;
    }



    //획득 경험치와 직업 번호를 받아옴
    public void calcCharcterExp(int gettingExps, int charNum){
        /* cur 에 획득 경험치 입력
         현재 경험치 - 필요 경험치 > 0 크면 요구치 충족 -> 레벨업 -> 레벌업했으니 스텟 증가 (소서리스)(3)
         -> 현재 경험치 - 요구 경험치 - > 요구 경험치 1.1배 -> 루프 반복

         */
        curExp += gettingExps;

        while(curExp - reqExp > 0) {
            lv ++ ;

            incStat(charNum);

            curExp -= reqExp;
            reqExp *= 1.1 ;
        }
    }

    //스텟 증가
    public void incSocStat (){
        hp += 100;
        mp += 10;

        str += 1;
        con += 1;
        dex += 1;
        luk += 1;
        iq += 5;
        men += 4;

    }

    //소서리스 (3) 을 받아 왔으므로 소서리스 스탯 증가로 이동
    public void incStat (int charNum) {
        switch (charNum) {
            case SOCERESS:
                incSocStat();
                break;
        }
    }

    // 상황 표시를 위한 프린트 ( 스텟 , 경험치 등)
    public void printInfo(){
        System.out.printf("pAtk: %d, mAtk: %d, hp: %d, mp: %d, " + "\n" +
                        "str: %d, con: %d, dex: %d, luk: %d, iq: %d, men: %d, " + "\n" +
                        "lv: %d, exp: %d / %d\n",
                (int)pAtk, (int)mAtk,
                (int)hp, (int)mp,
                (int)str, (int)con, (int)dex,
                (int)luk, (int)iq, (int)men,
                lv, curExp, reqExp);
    }
}
