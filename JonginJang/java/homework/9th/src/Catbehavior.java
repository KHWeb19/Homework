import java.util.Scanner;

public class Catbehavior {//문제 3

    final int EAT = 1;
    final int SLEEP = 2;
    final int PLAY = 3;

    public void catAct(){
        Scanner scan = new Scanner(System.in);
        System.out.println("고양이는 어떤 행동을 하나요?");
        int inputNum = scan.nextInt();
        switch(inputNum){

            case EAT:
                System.out.println("밥을 먹습니다.");
                break;
            case SLEEP:
                System.out.println("잠을 잡니다.");
                break;
            case PLAY:
                System.out.println("사냥놀이를 합니다.");
                break;
        }
    }


}
