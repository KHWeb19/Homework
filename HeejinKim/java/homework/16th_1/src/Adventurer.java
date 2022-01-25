public class Adventurer implements Skills {

    private float pAtk, mAtk;//물리 공격,마법 공격
    private float hp, mp;
    private float pDef, mDef; //물리방어,마법방어
    private float str, con, dex, agi, iq, men;//완력,체력,재주,민첩,지능,wjd신
    private int level;
    private int reqExp; //필요한 경험치
    private int curExp; //현재 경험치

    final float PATK = 50;
    final float MATK = 50;
    final float HP = 100;
    final float MP = 100;
    final float PDEF = 1;
    final float MDEF = 1;
    final int STR = 10;
    final int CON = 10;
    final int DEX = 10;
    final int AGI = 10;
    final int IQ = 10;
    final int MEN = 10;
    final int LEVEL = 1;
    final int REQEXP = 100;
    final int CUREXP = 0;

    final int MAJOR = 1000;
    final int MINOR = 200;

    final int WIZARD = 3;

    public Adventurer() {
        pAtk = PATK; //여기서 this를 안해주는 이유는 초기값이 final로 고정되어 있고 나중에 업데이트 되는 값을 객체에 넣어주기 위해서?
        mAtk = MATK;
        hp = HP;
        mp = MP;
        pDef = PDEF;
        mDef = MDEF;
        str = STR;
        con = CON;
        dex = DEX;
        agi = AGI;
        iq = IQ;
        men = MEN;
        level = LEVEL;
        reqExp = REQEXP;
        curExp = CUREXP;
    }

    public int calAttackDamage() { //공격데미지

        return (int) (pAtk * (str + 0.3 * dex));
    }

    @Override
    public void attack() {

        System.out.printf("%10d - 평타\n", calAttackDamage());
    }


    public int calQuackDamage() {

        return (int) (pAtk * (0.5 * str + 0.3 * dex));
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 돌던지기\n", calQuackDamage());

    }


    public int calEneStrDamage() {
        return (int) (mAtk * (1.1 * iq) + pAtk * (0.5 * str));
    }


    @Override
    public void wSkill() {
        System.out.printf("%10d - 단거리마법\n", calEneStrDamage());
    }


    public void setpAtk(float pAtkAdd) {
        this.pAtk += pAtk;
    }

    public void setmAtk(float mAtkAdd) {
        this.mAtk += mAtk;
    }

    public void setHp(float hpAdd) {
        this.hp += hp;
    }

    public void setMp(float mpAdd) {
        this.mp += mp;
    }

    public void setpDef(float pDefAdd) {
        this.pDef += pDef;
    }

    public void setmDef(float mDefAdd) {
        this.mDef += mDef;
    }

    public void setStr(float strAdd) {
        this.str += str;
    }

    public void setCon(float conAdd) {
        this.con += con;
    }

    public void setDex(float dexAdd) {
        this.dex += dex;
    }

    public void setAgi(float agiAdd) {
        this.agi += agi;
    }

    public void setIq(float iqAdd) {
        this.iq += iq;
    }

    public void setMen(float menAdd) {
        this.men += men;
    }

    public void setLevel(int levelAdd) {
        this.level += level;
    }

    public void setReqExp(int reqExpAdd) {
        this.reqExp += reqExp;
    }

    public void setCurExp(int curExpAdd) {
        this.curExp += curExp;
    }

    public float getpAtk() {
        return pAtk;
    }

    public float getmAtk() {
        return mAtk;
    }

    public float getHp() {
        return hp;
    }

    public float getMp() {
        return mp;
    }

    public float getpDef() {
        return pDef;
    }

    public float getmDef() {
        return mDef;
    }

    public float getStr() {
        return str;
    }

    public float getCon() {
        return con;
    }

    public float getDex() {
        return dex;
    }

    public float getAgi() {
        return agi;
    }

    public float getIq() {
        return iq;
    }

    public float getMen() {
        return men;
    }

    public int getLevel() {
        return level;
    }

    public int getReqExp() {
        return reqExp;
    }

    public int getCurExp() {
        return curExp;
    }

    public void calCharExp(int gettingExps, int charNum) { //charNum 은 위자드를 해주기 위해서

        curExp += gettingExps;

        while (curExp - reqExp > 0) { //레벨업
            level++;

            incStat(charNum);

            curExp -= reqExp;
            reqExp *= 1.1;
        }
    }

    public void incMagStat() {
        hp += 100;
        mp += 10;

        str += 1;
        con += 1;
        dex += 1;
        agi += 1;
        iq += 5;
        men += 4;
    }

    public void incStat(int charNum) {
        switch (charNum) {
            case WIZARD:
                incMagStat();
                break;
        }
    }
}
