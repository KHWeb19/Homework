import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RolePlayingGame extends MacroSet {

    CharacterManager cm;
    MonsterManager bm;

    final int MAX = 10000;
    final int MIN = 100;

    int range;

    public RolePlayingGame () {

        cm = new CharacterManager();
        bm = new MonsterManager();

        range = MAX - MIN + 1;
    }

    public void chooseRaidBose(){
        System.out.println("보스를 선택하세요");
        bm.chooseRaidBoss();
    }

    public void chooseMember(){
        System.out.println("멤버를 선택하세요.");
        cm.chooseMember();
    }

    
    public void bossRaid () throws InterruptedException {

        chooseRaidBose();
        chooseMember();

        int turnCnt = 1;

        // 보스가 죽었는지 판정
        while (!bm.isDead()) {
            System.out.printf("%d 턴입니다\n", turnCnt++);
            bm.raidTurnStart(cm);
            Thread.sleep(2000);
        }

        System.out.println("승리!!!");
    }

    public void printPartyInfo () {
        cm.printPartyInfo();
    }
                                        // cm이 필요한 이유는 내가 선택한 캐릭터가
                                        // 레벨업을 해야하기 때문이다.
    public void calcCharcterExp(int exps, CharacterManager cm){
        //public void calcCharcterExp (int gettingExps, int charNum)
        ArrayList<SelectedCharacter> member = cm.getMemberArrayList();
        SelectedCharacter sc;

        for(int i = 0; i< member.size(); i++){
            sc = member.get(i);

            ((Adventurer) sc.getCharacter()).calcCharcterExp(exps, sc.getSelectedNum());
        }
    }


    public void huntStart () throws InterruptedException {

        chooseMember();

        while (true) {
            printPartyInfo();
            //wiz.printInfo();
            doMacroSet(cm);
            calcCharcterExp(calcExps(), cm);
            //wiz.calcCharcterExp(calcExps(), THIRD);
            Thread.sleep(1500);
        }
    }


    public int calcExps () {
        return (int) (Math.random() * range + MIN);
    }
}
