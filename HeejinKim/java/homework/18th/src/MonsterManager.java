import java.util.Scanner;

    public class MonsterManager {
        // 이 클래스는 도대체 어떤 업무를 담당하는가 ?
        // 게임상 존재하는 모든 보스 레이드를 관리해주는 클래스다!
        // 1. 우선적으로 레이드를 치룰 보스몹 자체를 관리하도록 한다.
        private SelectedCharacter sc;

        private final Scanner scan = new Scanner(System.in);
        final int BIAS = 9999;

        public void procUserInput (int num) {
            switch (num + BIAS) {
                case MonsterNumber.FENRYL:
                    Fenryl fenryl = new Fenryl();
                    sc = new SelectedCharacter(
                            MonsterNumber.FENRYL, fenryl);
                    break;

                default:
                    break;
            }
        }

        public void chooseRaidBoss () {
            int cnt = 0;

            System.out.println("1번: 펜릴, 2번: 미구현, 3번: 미구현, 4번: 미구현, 5번: 미구현");

            while (cnt < 1) {
                System.out.print("번호를 입력하세요: ");
                int num = scan.nextInt();

                if (num >= 6 || num <= 0) {
                    continue;
                }

                cnt++;

                procUserInput(num);
            }
        }

        public boolean isDead () {
            boolean deadFlag = false;

            switch (sc.getSelectedNum()) {
                //sc에서 캐릭터 정보가지고옴
                case MonsterNumber.FENRYL:
                    //펜릴당첨>>펜릴 클래스에서 정보가지고옴
                    deadFlag = ((Fenryl) sc.getCharacter()).isDead();
                    break;
            }

            return deadFlag;
        }

        public void raidTurnStart (CharacterManager cm) {
            //파라메터로 넘겨주었기 때문에 bm에서 사용가능
            //캐릭터 매니저라는 타입이 레이드 턴 스타트로 입력되어 들어가고 있다 .클래스로 들고왔다도 무방함
            switch (sc.getSelectedNum()) {
                case MonsterNumber.FENRYL:
                    ((Fenryl) sc.getCharacter()).raidTurnStart(cm);//저 cm을 던저줌 .저게 필요하기 때문이다
                    break;
            }
        }
    }

