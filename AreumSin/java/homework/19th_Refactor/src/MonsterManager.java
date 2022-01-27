import java.util.Scanner;

public class MonsterManager {

    private SelectedCharacter sc;

    private Scanner scan = new Scanner(System.in);
    final int BIAS = 9999;

    public MonsterManager(){
        // 생성자, 반환값이 없음.

    }

    public void procUserInput(int num){
        switch (BIAS+num){
            case MonsterNumber.FENRYL:
                Fenryl fenryl = new Fenryl();
                sc = new SelectedCharacter(MonsterNumber.FENRYL, fenryl);
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

            if (num >= 6 || num <= 0)
                continue;

            cnt++;

            procUserInput(num);
        }
    }

    public boolean isDead(){
        boolean deadFlag = false;

        switch (sc.getSelectedNum()){
            case MonsterNumber.FENRYL:
                deadFlag = ((Fenryl)sc.getCharacter()).isDead();
                break;
        }
        return deadFlag;
    }

    public void raidTurnStart(CharacterManager cm){
        switch (sc.getSelectedNum()){
            case MonsterNumber.FENRYL:
                ((Fenryl)sc.getCharacter()).raidTurnStart(cm);
        }
    }

}
