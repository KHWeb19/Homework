import java.util.Scanner;

public class MonsterManager {

    private SelectedCharacter sc;

    private final Scanner scan = new Scanner(System.in);

    public void proUserInput(int num) {

        switch (num) {
            case MonsterNumber.Fenryl:
                Fenryl fen = new Fenryl();
                sc = new SelectedCharacter(
                        MonsterNumber.Fenryl, fen);
                member.add(sc);
                break;

            default:
                break;
        }
    }

    public void chooseRaidBoss() {
        int cnt = 0;

        System.out.println("1번 : 펜릴 2번 :  3번 :  4번 :  5번 : ");

        while (cnt < 1) {
            System.out.println("번호를 입력하세요.");
            int num = scan.nextInt();

            if (num >= 6 || num <= 0) {
                continue;
            }

            cnt++;

            proUserInput(num);

        }
    }

    public boolean isDead() {
        boolean deadFlag = false;

        switch (sc.getSelectedNum()) {
            case MonsterNumber.Fenryl:
                deadFlag = ((Fenryl) sc.getCharacter()).isDead();
                break;
        }
        return deadFlag;
    }

    public void raidTurnStart(CharacterManager cm) {
        switch (sc.getSelectedNum()) {
            case MonsterNumber.Fenryl:
                ((Fenryl) sc.getCharacter()).raidTurnStart();
                break;
        }
    }

    public dicisionObject(){

    }
}
