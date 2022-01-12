import java.util.Scanner;

public class Cat {

    Scanner scan ;
    int putNum;
    boolean isContinue = false;

    public void actionCat() {
        scan = new Scanner(System.in);

        while (!isContinue) {
            System.out.print("1. 걷기 2. 먹기 3. 자기 (번호를 누르세요)");
            putNum = scan.nextInt();

            switch (putNum) {
                case 1:
                    catWalk();
                    break;
                case 2:
                    catEat();
                    break;
                case 3:
                    catSleep();
                    break;
            }
        }
    }
    public void catWalk(){
        System.out.println("걷는다");
    }

    public void catEat(){
        System.out.println("먹는다");
    }

    public void catSleep(){
        System.out.println("잔다");
        isContinue = true;
    }
}
