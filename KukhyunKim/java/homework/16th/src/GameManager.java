public class GameManager extends MacroSet {
    Wizard wiz;

    final int THIRD = 2;
    final int MAX = 10000;
    final int MIN = 100;

    int range;

    public GameManager () {
        wiz = new Wizard();

        range = MAX - MIN + 1;
    }

    public void gameStart () throws InterruptedException {
        while (true) {
            doMacroSet(THIRD, wiz);
            wiz.calcCharcterExp(calcExps(), THIRD);
        }
    }
    public int calcExps () {
        return (int) (Math.random() * range + MIN);
    }
}
