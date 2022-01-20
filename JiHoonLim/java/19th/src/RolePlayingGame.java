public class RolePlayingGame extends MacroSet{
    // 나중에 리팩토리

    CharacterManager cm;
    MonsterManager bm;


    final int WARROAD = 1;
    final int SORCERESS = 2;
    final int HUNTER = 3;
    final int ASSASSIN = 4;
    final int SUPPORTER = 5;


    final int MAX = 10000;
    final int MIN = 100;

    int range;

    public RolePlayingGame(){

        cm = new CharacterManager();
        bm = new MonsterManager();

        range = MAX - MIN + 1;
    }

    // 전투캐릭 선택
    public void chooseMember(){
        System.out.println("보스전 멤버를 선택하세요.");
        cm.chooseMember();
    }

    public void chooseRaidBoss(){
        System.out.println("레이드 보스를 선택하세요");
        bm.chooseRaidBoss();
    }

    // 보스레이드
    public void bossRaid() throws InterruptedException {
        // 보스 선택
        chooseRaidBoss();

        // 레이드 파티 선정
        chooseMember();

        //턴 초기화
        int turnCnt = 1;


        // 보스의 생존 판정
        while(!bm.isDead()){
            System.out.printf("%d 턴 \n", turnCnt++);
            bm.raidTurnStart(cm);
            Thread.sleep(2000); // 2초
        }

        System.out.println("승리");
    }

    public void printPartyInfo(){
        cm.printPartyInfo();
    }


    public void huntStart() throws InterruptedException{
        chooseMember();

        // 매크로 반복
        while (true){
            printPartyInfo();
            // sor.printInfo();
            doMacroSet(cm);
            // doMacroSet(THIRD, sor);
            // sor.calcCharcterExp(calcExps(), THIRD);
        }
    }


    public int calcExps(){
        return (int)(Math.random() * range + MIN);
    }
}
