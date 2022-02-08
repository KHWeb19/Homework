

 public class Adventurer implements Skill {
     //1.기본스탯  2.데미지 계산  3.스킬을 구사했을 때 데미지계산 4.레벨업 경험치
     //5.직업군마다 레벨 올릴 때 주는 스탯  6.캐릭터 선택에 그 직업군의 증가 스탯을 매칭 7. 직업들의 정보 출력

     //기본 스탯 (phy atk, mag atk, hp, mp, phy def, mag def,
     //          str(완력), con(vit:체력), dex(재주), agi(민첩), iq(지능), men(정신))

     protected float pAtk, mAtk;
     protected float hp, mp;
     protected float pDef, mDef;
     protected float str, con, dex, agi, iq, men;
     protected int level;
     protected int reqExp;
     protected int curExp;

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

     public Adventurer() {
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

     public int calAttackDamage() {
         return (int) (pAtk * (str + 0.3 * dex));
     }

     @Override
     public void attack() {
         System.out.printf("%10d- 평타\n", calAttackDamage());
     }


     public int calcQauckDamage() {
         return (int) (pAtk * (0.6 * str + 0.3 * dex));
     }

     @Override
     public void qSkill() {
         System.out.printf("%10d-던지기\n", calcQauckDamage());

     }


     public int calcEngergyStrikeDamage() { //스탯만큼 데미지를 준다
         return (int) (mAtk * (1.2 * iq) + pAtk * (0.5 * str));
     }

     @Override
     public void wSkill() {
         System.out.printf("%10d-에너지 스크라이크\n", calcEngergyStrikeDamage());
     }


     public void calcCharacterExp(int gettingExps,int charNum) { //레벨업 경험치

         curExp += gettingExps; //얻은 경험치를 더해주고 루프를 돌면서 계산함

         while (curExp - reqExp > 0) {

             level++;

             incStat(charNum);

             curExp -= reqExp;

             reqExp *= 1.1;

         }
     }
     public void incStat (int charNum) {
             hp += 100;
             mp += 10;

             str += 1;
             con += 1;
             dex += 1;
             agi += 1;
             iq += 5;
             men += 4;
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

     public void printInfo () {

             System.out.printf("pAtk: %d, mAtk: %d, hp: %d, mp: %d, " + "\n" +
                             "str: %d, con: %d, dex: %d, agi: %d, iq: %d, men: %d, " + "\n" +
                             "level: %d, exp: %d / %d\n",
                     (int)pAtk, (int)mAtk, (int)hp, (int)mp,
                     (int)str, (int)con, (int)dex,
                     (int)agi, (int)iq, (int)men,
                     level, curExp, reqExp);
     }



 }



