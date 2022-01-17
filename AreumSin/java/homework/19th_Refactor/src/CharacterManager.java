import java.util.ArrayList;
import java.util.Scanner;

public class CharacterManager {
    // 왜 CharacterManger와 SelectedCharacter를 클래스로 나눠야 하는 이유는..
    // -> ArrayList가 다룰 클래스타입이 필요해서

    private Scanner scan = new Scanner(System.in);
    private ArrayList<SelectedCharacter> member;

    public CharacterManager(){
        // 생성자, 반환값이 없죠~
        member = new ArrayList<>();
    }

    public void printPartyInfo(){
        // 파티할 멤버 선택하기.
        // 파티할 멤버를 어디에 담을 것 인가?
        // ArrayList에 담을 것이다.
        // 배열을 사용하지 않고 ArrayList를 사용하는 이유는 뭘까?
        // 다룰 타입이 클래스라서?
        // 근데 안에 Object 타입으로 선택해서 객체화된 객체를 적여야하는거 아니가?
        // ArrayList가 다룰 타입의 클래스를 만들고
        // 그 클래스의 매개변수를 Object로 하면 된다.
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


    public void procUserInput (int num) { // 선택된 직업을 넘겨 받음.
        SelectedCharacter sc;
        // SelectedCharacter(num, obj)
        switch (num) {
            case CharacterNumber.KNIGHT:
                Knight kni = new Knight();

                sc = new SelectedCharacter(CharacterNumber.KNIGHT, kni);
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

        while(cnt < 3){
            System.out.print("번호를 입력 >>");
            int num = scan.nextInt();

            if(num >=6 || num <= 0)
                continue;

            cnt++;
            //일단 멤버를 선택하는걸 먼저 완성.

            procUserInput(num);
            // 선택된 직업을 넘겨줌.
            }
        }

    public int memberSize () {
        return member.size();
    }

    public ArrayList<SelectedCharacter> getMemberArrayList() {
        return member;
    }
}
