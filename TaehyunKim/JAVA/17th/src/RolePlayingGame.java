import java.util.ArrayList;

public class RolePlayingGame extends MacroSet{

    CharacterManager cm;
    MonsterManager bm;

    final int MAX = 10000;
    final int MIN = 100;

    int range;

    public RolePlayingGame(){
        bm = new MonsterManager();

        cm = new CharacterManager();

        range = MAX - MIN + 1;
    }

    public void chooseMember(){
        System.out.println("파티 멤버를 선별하세요!");
        cm.chooseMember();
    }

    public void chooseRaidBoss(){
        System.out.println("레이드 보스를 선택하세요!");
        bm.chooseRaidBoss();
    }

    public void bossRaid() throws InterruptedException {
        chooseRaidBoss();

        chooseMember();

        int turnCnt = 1;

        while (!bm.isDead()){
            System.out.printf("%d 턴입니다\n", turnCnt++);
            bm.raidTurnStart(cm);
            Thread.sleep(2000);
        }

        System.out.println("승리!!!");
    }

    public void printPartyInfo(){
        cm.printPartyInfo();
    }

    public void calcCharacterExps(int exps, CharacterManager cm){
        ArrayList<SelectedCharacter> member = cm.getMemberArrayList();

        SelectedCharacter sc;

        for (int i =0; i< member.size(); i++){
            sc = member.get(i);

            ((Adventurer) sc.getCharacter()).calcCharacterExp(exps, sc.getSelectedNum());
        }
    }

    public void huntStart() throws InterruptedException{
        chooseMember();

        while (true){
            printPartyInfo();
            doMacroSet(cm);
            calcCharacterExps(calcExps(), cm);
            Thread.sleep(1500);
        }
    }

    public int calcExps(){
        return (int) (Math.random() * range + MIN);
    }

}
