public class Warrior extends Adventurer{

    // 전사
    public Warrior(){
        super();

        // 주스텟
        strUpdate(MAJOR);
        conUpdate(MAJOR);

        //부스텟
        lukUpdate(MINOR);
        dexUpdate(MINOR);
        iqUpdate(MINOR);
        menUpdate(MINOR);
    }


    // 여기서부터 워리어 스킬
    public int calcBurstCannonDmg(){
        return (int) (5 * (getpAtk() * getStr() * 0.7 + getDex() *  0.1));
    }


    @Override
    public void qSkill() {
        //super.qSkill();  --> 스킬 계승 X
        System.out.printf("%10d - 버스트 캐논\n", calcBurstCannonDmg());
    }

    public int calcChargeDmg(){
        return (int) (getpAtk() * getStr() * 0.5 + getmAtk() *  0.3);
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 돌격(스턴 2초)\n", calcChargeDmg());
    }
}
