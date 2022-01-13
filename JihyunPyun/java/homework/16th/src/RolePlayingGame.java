public class RolePlayingGame extends MacroSet {
    Wizard wiz = new Wizard();

    final int THIRD = 3;
    final int MAX = 10000;
    final int MIN = 100;
    int range;

    public RolePlayingGame(){
        range = MAX - MIN + 1;
    }

    public void gameStart() throws InterruptedException {
//       메크로 돌아가는 중
        while (true){
            doMacroSet(THIRD, wiz);
            wiz.calcExp(calcExp(), THIRD);
            wiz.printInfo();
        }
    }

    public int calcExp () {
        return (int) (Math.random() * range + MIN);
    }


}
