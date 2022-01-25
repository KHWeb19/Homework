public class RolePlayingGame extends MacroSet{
    // 정석은 캐릭터관리 클래스를 만들어야함
    Sorceress sor;

    final int THIRD = 3;
    final int MAX = 10000;
    final int MIN = 100;

    int range;

    public RolePlayingGame(){
        sor = new Sorceress();

        range = MAX - MIN + 1;
    }

    public void gameStart() throws InterruptedException{
        // 매크로 반복
        while (true){
            doMacroSet(THIRD, sor);
            sor.calcCharcterExp(calcExps(), THIRD);
            sor.printInfo();
        }
    }

    public int calcExps(){
        return (int)(Math.random() * range + MIN);
    }
}
