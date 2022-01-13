public class Warrier extends Adventurer{

    public Warrier(){
            super();

            strUpdate(MAJOR);
            dexUpdate(MAJOR);
            hpUpdate(MAJOR);
            wisUpdate(MINOR);
            mpUpdate(MINOR);
    }

    public int calcSevenSlashDamage () {
        return (int) (7 * (getpAtk() * getStr() * 0.7 + getDex() * 0.1));
    }

    @Override
    public void qSkill() {
        // super.qSkill();
        // 모험가때 스킬 쓰게할꺼면 super 살려야함.
        // 지금은 스킬을 덮어 씌우는 식으로 할꺼라 필요없음
        System.out.printf("7연참 - %d\n", calcSevenSlashDamage());
    }

    public int calcSwordSharpenDamage () {
        return (int) (getpAtk() * getStr() * 0.5 + getmAtk() * 0.3);
    }

    @Override
    public void wSkill() {
        System.out.printf("칼등치기 (스턴 2초) - %d\n", calcSwordSharpenDamage());
    }


}
