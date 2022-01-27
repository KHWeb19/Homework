public class Wizard extends Magicion{

    //boost게이지를 만들수 있으나 일단은 생략

    public Wizard () {
        super();

        strUpdate(MINOR);
        conUpdate(MINOR);
        dexUpdate(MINOR);
        agiUpdate(MINOR);
        iqUpdate(MAJOR);
        menUpdate(MAJOR);


    }

    public int calcSuperGravityFieldDamage () {
        return (int) (100 * getmAtk() * getIq() * 1.1);
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 초중력(단일기 - boost 게이지 50 사용)\n",
                calcSuperGravityFieldDamage());
    }

    public int calcAltemaDamage () {
        return (int) (20 * getmAtk() * getIq() * 0.7);
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 알테마(범위기 - boost 게이지 20 사용)\n",
                calcAltemaDamage());
    }
}
