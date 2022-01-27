public class Level {

    final int MAXLEVEL = 99;
    final int STARTLEVEL = 1;

    protected int level = STARTLEVEL;;
    protected int[] reqExp = new int[MAXLEVEL];

    protected int curExp;

    public void initReqExp() {
        for (int i = 0; i < MAXLEVEL; i++) {
            reqExp[i] = 200 * (int) Math.pow(1.1, MAXLEVEL);
        }
    }

    public void getExp(){
        levelUp();
    }

    public void levelUp(){
        do {
            if (reqExp[level - 1] > curExp) {
                curExp -= reqExp[level - 1];
                level++;
            }
        }
        while(level <= MAXLEVEL);
    }

}
