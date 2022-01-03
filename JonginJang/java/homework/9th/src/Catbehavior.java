import java.util.Scanner;

public class Catbehavior {//문제 3
    public static void main(String[] args) {
    Cat cat = new Cat();
    final int EAT = 1;
    final int SLEEP = 2;
    final int PLAY = 3;


        Scanner scan = new Scanner(System.in);
        System.out.println("고양이는 어떤 행동을 하나요?");
        int inputNum = scan.nextInt();

        switch(inputNum){

            case EAT:
                cat.setAct("밥을 먹습니다.");
                System.out.println(cat.act());
                break;
            case SLEEP:
                cat.setAct("잠을 잡니다.");
                System.out.println(cat.act());
                break;
            case PLAY:
                cat.setAct("사냥놀이를 합니다.");
                System.out.println(cat.act());
                break;

        }

    }
}
