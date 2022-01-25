import java.util.ArrayList;
import java.util.Scanner;

public class CharacterManager {

    private final Scanner scan = new Scanner(System.in);

    private ArrayList<SelectedCharacter> member;

    public CharacterManager() {
        member = new ArrayList<>();
    }

    public void printPartyInfo() {
        SelectedCharacter sc;

        for (int i = 0; i < member.size(); i++) {
            sc = member.get(i);

            switch (sc.getSelectedNum()) {
                case CharacterNumber.KNIGHT:
                    System.out.println(((Knight) sc.getCharacter()));
                    break;

                case CharacterNumber.WIZARD:
                    System.out.println(((Wizard) sc.getCharacter()));
                    break;

                case CharacterNumber.SNIPER:
                    System.out.println(((Sniper) sc.getCharacter()));
                    break;

                case CharacterNumber.HOLYKING:
                    System.out.println(((HolyKing) sc.getCharacter()));
                    break;

                case CharacterNumber.ASSASSIN:
                    System.out.println(((Assassin) sc.getCharacter()));
                    break;
            }
        }
    }

    public void procUserInput(int num) {
        SelectedCharacter sc;

        switch (num) {
            case CharacterNumber.KNIGHT:
                Knight kni = new Knight();
                sc = new SelectedCharacter(
                        CharacterNumber.KNIGHT, kni);
                member.add(sc);
                break;

            case CharacterNumber.WIZARD:
                Wizard wiz = new Wizard();
                sc = new SelectedCharacter(
                        CharacterNumber.WIZARD, wiz);
                member.add(sc);
                break;

            case CharacterNumber.SNIPER:
                Sniper sni = new Sniper();
                sc = new SelectedCharacter(
                        CharacterNumber.SNIPER, sni);
                member.add(sc);
                break;

            case CharacterNumber.HOLYKING:
                HolyKing hk = new HolyKing();
                sc = new SelectedCharacter(
                        CharacterNumber.HOLYKING, hk);
                member.add(sc);
                break;

            case CharacterNumber.ASSASSIN:
                Assassin sin = new Assassin();
                sc = new SelectedCharacter(
                        CharacterNumber.ASSASSIN, sin);
                member.add(sc);
                break;
            default:
                break;
        }
    }

    public void chooseMember () {
        int cnt = 0;

        System.out.println("1번: 기사, 2번: 위자드, 3번: 스나이퍼, 4번: 성황, 5번: 어쌔신");

        while (cnt < 3) {
            System.out.print("번호를 입력하세요: ");
            int num = scan.nextInt();

            if (num >= 6 || num <= 0) {
                continue;
            }

            cnt++;

            procUserInput(num);
        }
    }
    public int memberSize () {
        return member.size();
    }
    public ArrayList<SelectedCharacter> getMemberArrayList () {
        return member;
    }

}
