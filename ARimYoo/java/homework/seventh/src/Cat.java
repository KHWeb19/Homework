import java.util.Scanner;

public class Cat {

    //static을 붙여야할까 ..?
    final int SLEEP = 1;
    final int EAT = 2;
    final int PLAY = 3;
    final int XXX = 4;

    public void doing (){

        Scanner scan = new Scanner(System.in);
        System.out.print("고양이가 무엇을 하고 있을까요?");
        int end = scan.nextInt();

        switch (end){
            case SLEEP :
                sleep();
                break;
            case EAT :
                eat();
                break;
            case PLAY :
                play();
                break;
            case XXX :
                xxx();
                break;
            default:  System.out.println("결과값이 없습니다.");
                break;
        }
    }

    public void sleep () {
        System.out.println("고양이가 자고 있습니다.");
    }

    public void eat () {
        System.out.println("고양이가 밥을 먹습니다.");
    }

    public void play () {
        System.out.println("고양이가 놀고 있습니다.");
    }

    public void xxx () {
        System.out.println("고양이가 배변활동 중 입니다.");
    }
}
