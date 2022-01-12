public class Adventurer implements Skill{
    // 6. 기본 스탯( phy atk, mag atk, hp, mp, phy def, mag def //atk - 공격
    //             str - 완력, con(vit) - 체력, dex - 재주, agi - 민첩, iq - 지능, men - 정신
    //    6-2. 경험치 바와 레벨 정보 추가

    // 초기값은 지정해두고 값은 변할 수 있으니

    private float pAtk, mAtk; // 물공, 마공..?
    private float hp, mp;
    private float pDef, mDef;
    private float str, con, dex, agi, iq, men;
    private int level;
    private int reqExp; // 필요한 경험치
    private int curExp; // 현재 경험치

    final float PATK = 50;
    final float MATK = 50;
    final float HP = 100;
    final float MP = 100;
    final float PDEF =1;
    final float MDEF =1;

    final int STR = 10;
    final int CON = 10;
    final int DEX = 10;
    final int AGI = 10;
    final int IQ = 10;
    final int MEN = 10;
    final int LEVEL = 1;
    final int REQEXP = 100;
    final int CURQEXP = 100;

    final int MAJOR = 1000;
    final int MINOR = 500;

    final int WIZARD =3;

    public Adventurer(){
        pAtk = PATK;
        mAtk = MATK;
        hp = HP;
        mp = MP;
        pDef = PDEF;
        mDef = MDEF;
        str = STR;
        con = CON;
        dex =DEX;
        agi = AGI;
        iq = IQ;
        men = MEN;
        level = LEVEL;
        reqExp = REQEXP;
        curExp = CURQEXP;
    }

    public int calcAttackDamage(){ // 피해력? 공격력? // 데미지 계산
        return (int)(pAtk * (str + 0.3 * dex));
    }

    @Override
    public void attack() {
        System.out.printf("%10d - 평타\n",calcAttackDamage());
    }

    public int calcQuackDamage(){
        return (int)(pAtk * (0.6 * str + 0.3 * dex));
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 돌팔매\n",calcQuackDamage());
    }

    public int calcEnergyStrikeDamage(){
        return (int)(mAtk * (1.2 * iq) +pAtk + ( 0.5 *str));
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 에너지 스트라이크(근거리)\n", calcEnergyStrikeDamage());
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

    // 값을 세팅하는게 아니라 값을 추가하는중
    // 값을 갱신 할 수 있도록 만든것.
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

    public void LevelUpdate(int levelAdd) {
        this.level += levelAdd;
    }

    public void ReqExpUpdate(int reqExpAdd) {
        this.reqExp += reqExpAdd;
    }

    public void CurExpUpdate(int curExpAdd) {
        this.curExp += curExpAdd;
    }

    public void StrUpdate(float strAdd) {
        this.str += strAdd;
    }

    public void ConUpdate(float conAdd) {
        this.con += conAdd;
    }

    public void DexUpdate(float dexAdd) {
        this.dex += dexAdd;
    }

    public void AgiUpdate(float agiAdd) {
        this.agi += agiAdd;
    }

    public void IqUpdate(float iqAdd) {
        this.iq += iqAdd;
    }

    public void MenUpdate(float menAdd) {
        this.men += menAdd;
    }

    public void charNum(){

    }
    public void calcCharcterExp(int gettingExps, int charNum){
        // 1. 입력된 경험치를 작용한다.
        // 2. 레벨업마다 요구 경험치를 증가시킨다.

        //int tmp = gettingExps - reqExp; // 현재 벌어온 경험치 값 - 필요한 값
                                        // 0보다 크면 레벨업!

        // 경험치 계산 이후 다음 경험치는?
        // curExp에 저장되는 부분을 고려하지않음.

        curExp += gettingExps;

        while ( curExp - reqExp > 0 ) { // 레벨업 할 경우
            level ++;
            curExp -= reqExp;
            incStat(WIZARD);
            reqExp *= 1.1;
        }

    }

    public void incMagStat(){
        hp += 100;
        mp += 10;

        str += 1;
        con += 1;
        dex += 1;
        agi += 1;
        iq += 5;
        men += 4;

    }

    public void incStat(int charNum){ // 스탯증가
        switch (charNum){
            case WIZARD:
                incMagStat();
                break;
        }
    }
}
