public class Wizard extends Magician{

    public Wizard () {
        super();

        wisUpdate(MAJOR);
        dexUpdate(MAJOR);
        mpUpdate(MAJOR);
        strUpdate(MINOR);
        hpUpdate(MINOR);
    }

    public int calcSuperGravityFieldDamage () {
        return (int) (100 * getmAtk() * getWis() * 1.5);
    }

    @Override
    public void qSkill() {
        System.out.printf("초중력(단일기 - boost 게이지 50 사용) - %d \n",
                calcSuperGravityFieldDamage());
    }

    public int calcAltemaDamage () {
        return (int) (getmAtk() * 20 + (getWis() * 0.7 + getDex() * 0.2));
    }

    @Override
    public void wSkill() {
        System.out.printf("알테마(범위기 - boost 게이지 20 사용) - %d\n", calcAltemaDamage());
    }

    public void printInfo () {
        System.out.printf("hp: %d, mp: %d, " + "\n" +
                        "str: %d, wis: %d, dex: %d " + "\n" +
                        "level: %d, exp: %d / %d\n",
                (int)getHp(), (int)getMp(),
                (int)getStr(), (int)getWis(), (int)getDex(),
                getLevel(), getCurExp(), getReqExp());
    }

//    'class' or 'interface' expected 에러
//    -> '}' 한개 더 입력했더니 떴음
}

