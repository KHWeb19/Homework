import java.util.ArrayList;
import java.util.Scanner;

public class CharacterManager {
    private final Scanner scan = new Scanner(System.in);

    // 전체 캐릭터 관리 클래스
    // 레이드 멤버 관리

    // SelectedCharacter - 직업을 이 member에 넣을 때
    // object로 받아야하는 문제가 있다
    // rpg 에서 두개의 object를 여기서 한번에 하기 위함
    private ArrayList<SelectedCharacter> member;


    public CharacterManager(){
        member = new ArrayList<>();
    }

    public void printPartyInfo(){
        SelectedCharacter sc;

        for (int i = 0; i < member.size(); i ++){
            sc = member.get(i);

            switch (sc.getSelectedNum()){
                case CharacterNumber.WARROAD:
                    System.out.println(((Warroad) sc.getCharacter()));
                    break;

                case CharacterNumber.SORCERESS:
                    System.out.println(((Sorceress) sc.getCharacter()));
                    break;

                case CharacterNumber.HUNTER:
                    System.out.println(((Hunter) sc.getCharacter()));
                    break;

                case CharacterNumber.ASSASSIN:
                    System.out.println(((Assassin) sc.getCharacter()));
                    break;

                case CharacterNumber.SUPPORTER:
                    System.out.println(((Supporter) sc.getCharacter()));
                    break;
            }
        }
    }

    public void proUserInput(int num){
        // 선택한 번호에 따라 레이드 멤버와 멤버체크리스트 추가
        switch (num) {
            case CharacterNumber.WARROAD:
                Warroad warroad = new Warroad();
                SelectedCharacter sc = new SelectedCharacter(
                        CharacterNumber.WARROAD,warroad);
                member.add(sc);
                break;
            case CharacterNumber.SORCERESS:
                Sorceress sor = new Sorceress();
                sc = new SelectedCharacter(
                        CharacterNumber.SORCERESS,sor);
                member.add(sc);
                break;
            case CharacterNumber.HUNTER:
                Hunter hun = new Hunter();
                sc = new SelectedCharacter(
                        CharacterNumber.HUNTER,hun);
                member.add(sc);
                break;
            case CharacterNumber.ASSASSIN:
                Assassin ass = new Assassin();
                sc = new SelectedCharacter(
                        CharacterNumber.ASSASSIN,ass);
                member.add(sc);
                break;
            case CharacterNumber.SUPPORTER:
                Supporter sup = new Supporter();
                sc = new SelectedCharacter(
                        CharacterNumber.SUPPORTER,sup);
                member.add(sc);
                break;
            default:
                break;
        }
    }

    public void chooseMember(){
        int cnt = 0;

        System.out.println("1번 : 전사 2번: 법사 3: 헌터 4: 암살자 5: 서포터");

        while (cnt < 3){
            System.out.println("번호를 입력하세요.");
            int num = scan.nextInt();

            if (num >= 6 || num <= 0){
                continue;
            }

            cnt ++;

            proUserInput(num);

        }
    }

    public int memberSiz(){
        return member.size();
    }

    public ArrayList<SelectedCharacter> getMemberArrayList(){

    }
}
