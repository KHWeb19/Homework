public abstract class Adventurer implements Skill {
    private float pAtk, mAtk;
    private float hp, mp;
    private float pDef, mDef;
    private float str, con, dex, agi, iq, men; //완력, 체력, 재주, 민첩, 지능, 정신
    private int level;
    private int reqExp;
    private int curExp;

    final float PATK = 50;
    final float MATK = 50;
    final float HP =100;
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

    final int WIZARD =3;

    public Adventurer(){
        pAtk = PATK;
        mAtk =MATK;
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

    public int calcAttackDamage() {return (int)(pAtk *( str +0.3* dex));}

    public void attack(){
        System.out.printf("%10d - 평타\n", calcAttackDamage());
    }
    public int calcQuackDamge(){

        return 0;
    }
}
