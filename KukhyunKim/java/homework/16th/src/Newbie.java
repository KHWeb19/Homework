public class Newbie {
    private float Atk;
    private int level;
    private int reqExp;
    private int curExp;

    final float ATK = 10;

    final int LEVEL = 1;
    final int REQEXP = 100;
    final int CUREXP = 0;

    final int BONUS = 1;

    final int WIZARD = 3;

    public Newbie () {
        Atk = ATK;
        level = LEVEL;
        reqExp = REQEXP;
        curExp = CUREXP;
    }

    public int calcAttackDamage () {
        return (int) (Atk);
    }
    public void attack() {
        System.out.printf("%10d - 평타\n", calcAttackDamage());
    }

    public int calcQuackDamage () {
        return (int) (Atk * 1.5 );
    }
    public void qSkill() {
        System.out.printf("%10d - 파워어택\n", calcQuackDamage());
    }

    public int calcEnergyStrikeDamage () {
        return (int) (Atk * 2 );
    }
    public void wSkill() {
        System.out.printf("%10d - 더블어택\n", calcEnergyStrikeDamage());
    }

    public void AtkUpdate(float AtkAdd) {
        this.Atk += AtkAdd;
    }
    public void levelUpdate(int levelAdd) {
        this.level += levelAdd;
    }
    public void reqExpUpdate(int reqExpAdd) {
        this.reqExp += reqExpAdd;
    }
    public void curExpUpdate(int curExpAdd) {
        this.curExp += curExpAdd;
    }
    public float getAtk() {
        return Atk;
    }
    public int getLevel() {
        return level;
    }
    public int getReqExp() {
        return reqExp;
    }
    public int getCurExp() {
        return curExp;
    }
    public void calcCharcterExp (int gettingExps, int charNum) {
        curExp += gettingExps;

        while (curExp - reqExp > 0) {
            level++;

            incStat(charNum);

            curExp -= reqExp;
            reqExp *= 1.1;
        }
    }
    public void incMagStat () {
        Atk += 1;
    }
    public void incStat (int charNum) {
        switch (charNum) {
            case WIZARD:
                incMagStat();
                break;
        }
    }
}
