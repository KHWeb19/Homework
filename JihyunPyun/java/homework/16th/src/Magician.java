public class Magician extends Adventurer{

    public Magician (){
        super();

        wisUpdate(MAJOR);
        dexUpdate(MAJOR);
        mpUpdate(MAJOR);
        strUpdate(MINOR);
        hpUpdate(MINOR);
    }

    public int calcChainLightningDamage () {
        return (int) (getmAtk() * getWis() * 3);
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 체인 라이트닝(원거리)\n", calcChainLightningDamage());
    }

    public int calcFrostNovaDamage () {
        return (int) (getmAtk() * (getWis() * 0.3 + getDex() * 0.1));
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 프로스트 노바(광범위): 범위 슬로우\n", calcFrostNovaDamage());
    }
}
