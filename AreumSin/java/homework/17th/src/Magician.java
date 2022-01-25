public class Magician extends Adventurer{

    public Magician(){
        super(); // -> 부모클래스 생성자를 부름..?

        // 모험가 -> 법사 되면서 스탯에 추가
        strUpdate(MINOR); // 500
        conUpdate(MINOR);
        dexUpdate(MINOR);
        agiUpdate(MINOR);
        iqUpdate(MAJOR);  //1000
        menUpdate(MAJOR);
    }


    public int calcChainLightningDamage () {
        return (int) (getmAtk() * getIq() * 2.5);
    }


    @Override
    public void qSkill() {
        // super.qSkill(); // 원래 있던거 + 추가 하려면 사용.
        // 덮어쓰려면 사용하면 안됨.
        System.out.printf("%10d - 체인 라이트닝(원거리)\n", calcChainLightningDamage());
    }

    public int calcFrostNovaDamage () {
        return (int) (getmAtk() * getIq() * 0.25);
    }

    @Override
    public void wSkill() {
        //super.wSkill();
        System.out.printf("%10d - 프로스트 노바(광범위): 범위 슬로우\n", calcFrostNovaDamage());
    }
}
