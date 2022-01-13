public class Adventurer implements  Skill{
    // 6. 기본 스탯 (phy atk, mag atk, hp, mp, phy def, mag def,
    //              str(완력), con(vit:체력), dex(재주), agi(민첩), iq(지능), men(정신))

    // private는 직접적으로 접근 못하도록하는것.
    // 선언된 영역에서만 가능함.
    // 근데 레벨업을 하면 값을 더 줄건데 private를 해도 되나..?
    // 그래서 똑같이 하나 더 만들어준건가?

    final int WIZARD = 3;

    private float pAtk, mAtk;
    private float hp, mp;
    private float pDef, mDef;
    private float str, con, dex, agi, iq, men;

    // 현재 레벨, 레벨업필요한 거
    private int level;
    private int reqExp;
    private int curExp;

    // 시작 값 부여
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
    final int MINOR = 500;

    Adventurer(){
        pAtk = PATK;
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

    // 기본 공격들해야함..
    public int calcAttackDamage () {
        return (int) (pAtk * (str + 0.3 * dex));
    }

    @Override
    public void attack() {
        System.out.printf("%10d - 평타\n", calcAttackDamage());
    }

    public int calcQuackDamage () {
        return (int) (pAtk * (0.6 * str + 0.3 * dex));
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 돌팔매(원거리)\n", calcQuackDamage());
    }

    public int calcEnergyStrikeDamage () {
        return (int) (mAtk * (1.2 * iq) + pAtk * (0.5 * str));
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 에너지 스트라이크(근거리)\n", calcEnergyStrikeDamage());
    }

    public void pAtkUpdate(float pAtkAdd) {
        this.pAtk += pAtkAdd;
    }

    public void mAtkUpdate(float mAtkAdd) {
        this.mAtk += mAtkAdd;
    }

    public void HpUpdate(float hpAdd) {
        this.hp += hpAdd;
    }

    public void MpUpdate(float mpAdd) {
        this.mp += mpAdd;
    }

    public void pDefUpdate(float pDefAdd) {
        this.pDef += pDefAdd;
    }

    public void mDefUpdate(float mDefAdd) {
        this.mDef += mDefAdd;
    }

    public void strUpdate(float strAdd) {
        this.str += strAdd;
    }

    public void conUpdate(float conAdd) {
        this.con += conAdd;
    }

    public void dexUpdate(float dexAdd) {
        this.dex += dexAdd;
    }

    public void agiUpdate(float agiAdd) {
        this.agi += agiAdd;
    }

    public void iqUpdate(float iqAdd) {
        this.iq += iqAdd;
    }

    public void menUpdate(float menAdd) {
        this.men += menAdd;
    }

    public void levelUpdate(int levelAdd) {
        this.level += levelAdd;
    }

    public void reqExpUpdate(int reqExpAdd) {
        this.reqExp += reqExpAdd;
    }

    public void curExpUpdate(int curExpAdd) {
        this.curExp += curExpAdd;
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

    public void calcCharcterExp (int gettingExps, int charNum){

        curExp += gettingExps;

        while(curExp - reqExp > 0){
            level++;

            incStat(charNum);

            curExp -= reqExp;
            reqExp *= 1.1;
        }
    }

    public void incMagStat () {
        hp += 100;
        mp += 10;

        str += 1;
        con += 1;
        dex += 1;
        agi += 1;
        iq += 5;
        men += 4;
    }

    public void incStat (int charNum) {
        switch (charNum) {
            case WIZARD:
                incMagStat();
                break;
        }
    }


}
