public class Magician extends Newbie {

    public Magician () {
        super();

        AtkUpdate(BONUS);
    }

    public int calcMagicArrowDamage () {
        return (int) (getAtk() * 5 );
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 매직 애로우\n", calcMagicArrowDamage());
    }

    public int calcFireBallDamage () {
        return (int) (getAtk() * 7 );
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 파이어 볼\n", calcFireBallDamage());
    }
}