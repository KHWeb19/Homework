public class RolePlayingGame extends MacroSet{
    // 게임 해야한다.
    // 끝은 없도록하고 계속 공격한다.
    // 턴을 관리해줘야한다. (부스터 게이지가 턴당 +1이기 때문에 턴을 관리하는건가요?)
    // 아니면 그냥 레벨업을 얼마나 잘하나 보기 위해서..?

    // wizard 클래스 하나만 활용
    // 근데 MacroSet을 만들어주는 이유는 멀까?
    // 위자드만 해야해서
    // 위자드만 클래스만 사용하니깐 MacroSet을 통해서 그것만 돌아가게하는거라서
    // 그럼 적정 레벨이 되고 2차 전직이 일어나면 MacroSet에서 if문을 만들어줘서
    // 전사든 법사든 선택하게 할 수 있을까?

    // MacroSet을 이용해 계속 공격할 수 있도록.

    Wizard wiz;

    final int THIRD =3;
    final int MAX = 10000;
    final int MIN = 100;

    int range;

    public RolePlayingGame(){
        wiz = new Wizard();
        // Wizard가 된 많은 사람 중 wiz를 하나 선택한거.

        range = MAX - MIN +1;
    }

    public void gameStart() throws InterruptedException {
        while (true){
            doMacroSet(THIRD, wiz);
            // 위자드 선택, wiz..?
            // 객체화된걸 넘긴다..
            // wiz로 클래스 Wizard를 접근하게 해줘라? 이런 의미인가?
            wiz.calcCharcterExp(calcExp(), THIRD);
            // System.out.println(wiz);
            wiz.printInfo();

        }
    }

    public int calcExp(){
        return (int)(Math.random()* range +MIN);
    }


}
