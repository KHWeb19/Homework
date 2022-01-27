import java.util.ArrayList;
import java.util.Scanner;

public class RolePlayingGame extends MacroSet{
    // 정석은 캐릭터관리 클래스를 만들어야함
    Warroad warroad;
    Sorceress sor;
    Hunter hun;
    Assassin ass;
    Supporter sup;
    // 나중에 리팩토리

    Fenryl fen;

    Scanner scan;

    ArrayList<Object> raidMember;
    ArrayList<Integer> memberCheckList;

    final int WARROAD = 1;
    final int SORCERESS = 2;
    final int HUNTER = 3;
    final int ASSASSIN = 4;
    final int SUPPORTER = 5;


    final int MAX = 10000;
    final int MIN = 100;

    int range;

    public RolePlayingGame(){
        warroad = new Warroad();
        sor = new Sorceress();
        hun = new Hunter();
        ass = new Assassin();
        sup = new Supporter();

        fen = new Fenryl();

        scan = new Scanner(System.in);

        raidMember = new ArrayList<>();
        memberCheckList = new ArrayList<>();

        range = MAX - MIN + 1;
    }

    // 전투캐릭 선택
    public void chooseMember(){
        System.out.println("1번 : 전사 2번: 법사 3: 헌터 4: 암살자 5: 서포터");

        for ( int i = 0 ; i < 3 ; i++){
            System.out.println("번호를 입력하세요.");
            int num = scan.nextInt();

            // 선택한 번호에 따라 레이드 멤버와 멤버체크리스트 추가
            switch (num) {
                case WARROAD:
                    raidMember.add(warroad);
                    memberCheckList.add(WARROAD);
                    break;
                case SORCERESS:
                    raidMember.add(sor);
                    memberCheckList.add(SORCERESS);
                    break;
                case HUNTER:
                    raidMember.add(hun);
                    memberCheckList.add(HUNTER);
                    break;
                case ASSASSIN:
                    raidMember.add(ass);
                    memberCheckList.add(ASSASSIN);
                    break;
                case SUPPORTER:
                    raidMember.add(sup);
                    memberCheckList.add(SUPPORTER);
                    break;
                default:
                    continue;
            }
        }
    }

    // 보스레이드
    public void bossRaid() throws InterruptedException {
        // 레이드 파티 선정
        System.out.println("보스전 멤버를 선택하세요.");
        chooseMember();

        //턴 초기화
        int turnCnt = 1;


        // 보스의 생존 판정
        while(!fen.isDead()){
            System.out.printf("%d 턴 \n", turnCnt++);
            fen.raidTurnStart(raidMember, memberCheckList);
            Thread.sleep(2000); // 2초
        }

        System.out.println("승리");
    }

    /*
    public void gameStart() throws InterruptedException{
        // 매크로 반복
        while (true){
            sor.printInfo();
            doMacroSet(THIRD, sor);
            sor.calcCharcterExp(calcExps(), THIRD);
        }
    }
     */

    public int calcExps(){
        return (int)(Math.random() * range + MIN);
    }
}
