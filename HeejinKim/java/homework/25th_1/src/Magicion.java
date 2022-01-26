public class Magicion extends Adventurer{

    public Magicion(){
        super();
        strUpdate(MINOR);
        conUpdate(MINOR);
        dexUpdate(MINOR);
        agiUpdate(MINOR);
        iqUpdate(MAJOR);
        menUpdate(MAJOR);


    }
    public int calcChainLightningDamage () {
        return (int) (getmAtk() * getIq() * 2.5); //adventurer클래스에서 get을 사용해서 공격 스탯등을 가지고 올수 있었음
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 체인 라이트닝(원거리)\n", calcChainLightningDamage());
    }

    public int calcFrostNovaDamage () {
        return (int) (getmAtk() * getIq() * 0.25);
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 프로스트 노바(광범위): 범위 슬로우\n", calcFrostNovaDamage());
    }
}





