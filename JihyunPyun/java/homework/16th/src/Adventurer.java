public class Adventurer implements Skill {

//    기본 스텟 : str(힘), dex(민첩), wis(지혜) - 헷갈리니까 조금만
//

    private float str, dex, wis;
    private float hp, mp;
    private int level, reqExp, curExp;
    private float pAtk, mAtk;
    private float pDef, mDef;

    final float STR = 10;
    final float DEX = 10;
    final float WIS = 10;
    final int LEVEL = 1;
    final float HP = 30;
    final float MP = 20;
    final int REQEXP = 100;
    final int CUREXP = 0;
    final float PATK = 50;
    final float MATK = 50;
    final float PDEF = 10;
    final float MDEF = 10;

    final int MAJOR = 1000;
    final int MINOR = 500;

    final int WIZARD = 3;

    public Adventurer(){
        str = STR;
        dex = DEX;
        wis = WIS;
        level = LEVEL;
        hp = HP;
        mp = MP;
        reqExp = REQEXP;
        curExp = CUREXP;
        pAtk = PATK;
        mAtk = MATK;
        pDef = PDEF;
        mDef = MDEF;
    }

//    공격, 스킬 관련
    public int clacAttackDamage(){
        return (int) (pAtk * (str * 0.3));
    }

    @Override
    public void attack(){
        System.out.printf("공격! - %d\n", clacAttackDamage());
    }

    public int calcQDamage(){
        return (int) (pAtk * (str * 0.5 + dex * 0.3));
    }

    public void qSkill() {
        System.out.printf("돌 던지기! - %d\n", calcQDamage());

    }

    public int calcWDamage(){
        return (int) (mAtk * (wis * 1.2) + pAtk * (str * 0.3));
    }

    public void wSkill() {
        System.out.printf("에너지 스트라이크! - %d\n", calcWDamage());
    }


//  경험치 계산
    public void calcExp (int getExp, int charNum){
        curExp += getExp;
        //요구하는 경험치 채웠을경우 렙업 & 요구 경험치 증가
        while (curExp - reqExp > 0){
            level++;
            curExp -= reqExp;
                if (level > 200){
                    reqExp *= 1.4;
                } else {
                    reqExp *= 1.1;
                }
           incStat(charNum);
        }
    }

// 렙업 했을때 증가하는 스텟
    public void incMagStat () {
        hp += 100;
        mp += 30;

        str += 1;
        wis += 1;
        dex += 1;
    }

    public void incStat (int charNum) {
        switch (charNum) {
            case WIZARD:
                incMagStat();
                break;
        }
    }

    // 그냥 단순 스텟 증가

    public void hpUpdate(float hpAdd){
        this.hp += hpAdd;
    }

    public void mpUpdate(float mpAdd){
        this.mp += mpAdd;
    }

    public void strUpdate(float strAdd){
        this.str += strAdd;
    }

    public void dexUpdate(float dexAdd){
        this.dex += dexAdd;
    }

    public void wisUpdate(float wisAdd){
        this.wis += wisAdd;
    }

    public void pAtkUpdate(float pAtkAdd){
        this.pAtk += pAtkAdd;
    }

    public void mAtkUpdate(float mAtkAdd){
        this.mAtk += mAtkAdd;
    }

    public void pDefUpdate(float pDefAdd){
        this.pDef += pDefAdd;
    }

    public void mDefUpdate(float mDefAdd){
        this.mDef += mDefAdd;
    }

    public void reqExpUpdate(int reqExpAdd) {
        this.reqExp += reqExpAdd;
    }

    public void curExpUpdate(int curExpAdd) {
        this.curExp += curExpAdd;
    }

    public void levelUpdate(int levelAdd) {
        this.level += levelAdd;
    }

//    값 가져오기

    public float getStr() {
        return str;
    }

    public float getDex() {
        return dex;
    }

    public float getWis() {
        return wis;
    }

    public float getHp() {
        return hp;
    }

    public float getMp() {
        return mp;
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

    public float getpAtk() {
        return pAtk;
    }

    public float getmAtk() {
        return mAtk;
    }

    public float getpDef() {
        return pDef;
    }

    public float getmDef() {
        return mDef;
    }



}

