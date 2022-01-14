public class Magician extends Adventurer{


    public Magician(){

        super();

        setStr(MINOR);
        setCon(MINOR);
        setDex(MINOR);
        setAgi(MINOR);
        setIq(MAJOR);
        setMen(MAJOR);
    }

    public int calLightDamage () {
        return (int) (getmAtk() * getIq() * 3);
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d -라이트닝(원거리)\n", calLightDamage());
    }
    public int calFireDamage(){

        return  (int)(getmAtk() * getIq() * 0.8);
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d -파이어(광범위)\n",calFireDamage());
    }
}
