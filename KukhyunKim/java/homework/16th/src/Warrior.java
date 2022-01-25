public class Warrior extends Newbie {

    public Warrior () {
        super();

        AtkUpdate(BONUS);
    }

    public int calcSevenSlashDamage () {
        return (int) (getAtk() * 5);
    }

    @Override
    public void qSkill() {
        System.out.printf("%10d - 돌진\n", calcSevenSlashDamage());
    }

    public int calcSwordSharpenDamage () {
        return (int) (getAtk() *  7 );
    }

    @Override
    public void wSkill() {
        System.out.printf("%10d - 회전베기\n", calcSwordSharpenDamage());
    }
}