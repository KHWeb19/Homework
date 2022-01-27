public class Wizard extends Magician{
     private int boost;

    public Wizard(){
        super();

        StrUpdate(MINOR);
        ConUpdate(MINOR);
        DexUpdate(MINOR);
        AgiUpdate(MINOR);
        IqUpdate(MAJOR);
        MenUpdate(MAJOR);

        boost = 0;
    }

    public int calcSuperGravityFieldDamege(){
        return (int)(100 * getpAtk() * getIq() * 0.9 );
    }

    public int calcAltemaDamage(){
        return (int)(20 * getmAtk() * getIq() * 0.7);
    }

    @Override
    public void qSkill() {

        System.out.printf("%10d - 초중력(단일기 - boost 게이지지)\n",calcSuperGravityFieldDamege());
    }

    @Override
    public void wSkill() {

        System.out.printf("%10d - 칼등치기: 스턴 2초\n",calcAltemaDamage());
    }

    public void printInfo(){// 다 print해 봐야하지만 다 적기 귀찮으니 level만

        System.out.printf("level: %d", getLevel());
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "HP=" + HP +
                ", MP=" + MP +
                ", STR=" + STR +
                ", CON=" + CON +
                ", DEX=" + DEX +
                ", AGI=" + AGI +
                ", IQ=" + IQ +
                ", MEN=" + MEN +
                ", LEVEL=" + LEVEL +
                ", REQEXP=" + REQEXP +
                ", CURQEXP=" + CURQEXP +
                '}';
    }
}
