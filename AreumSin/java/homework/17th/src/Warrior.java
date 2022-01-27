public class Warrior extends Adventurer {

    public Warrior(){
        super();

        strUpdate(MAJOR);
        conUpdate(MAJOR);
        dexUpdate(MINOR);
        agiUpdate(MINOR);
        iqUpdate(MINOR);
        menUpdate(MINOR);
    }

    public int calcSevenSlashDamage () {
        return (int) (7 * (getpAtk() * getStr() * 0.7 + getDex() * 0.1));
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 7연참(근거리)\n", calcSevenSlashDamage());
    }

    public int calcSwordSharpenDamage () {
        return (int) (getpAtk() * getStr() * 1.6 + getmAtk() * 0.5);
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 칼등치기(근거리): 스턴 2초\n", calcSwordSharpenDamage());
    }
}
