public class Wizard extends Magician {
    private int boost;

    public Wizard () {
        super();

        AtkUpdate(BONUS);
    }

    public int calcIceStrikeDamage () {
        return (int) (getAtk() * 10);
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 아이스 스트라이크\n",
                calcIceStrikeDamage());
    }

    public int calcThunderDamage () {
        return (int) (getAtk() * 20);
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 썬더\n",
                calcThunderDamage());
    }
}