public class Knight extends Warrior {


    public Knight () {
        super();

        AtkUpdate(BONUS);
    }
    public int calcTenStrikesDamage () {
        return (int) (getAtk() * 10);
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 십연격\n", calcTenStrikesDamage());
    }


    public int calcSwordExplosionDamage () {
        return (int) (20 * getAtk() * 20);
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 소드 익스플로젼\n", calcSwordExplosionDamage());
    }
}