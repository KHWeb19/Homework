import java.util.Scanner;

public class M3CatClass {

    static final int ATC1 = 1;
    static final int ATC2 = 2;
    static final int ATC3 = 3;


    static Scanner scan = new Scanner(System.in);


    static boolean isNotFinish = true;


    public void chooseAct() {
            System.out.println("고양이가 무엇을할까요?\t1~3사이 아무 버튼이나 눌러보세요");
            int action = scan.nextInt();
            switch (action) {
                case ATC1:
                    System.out.println("고양이가 뛰기를 합니다");
                    break;
                case ATC2:
                    System.out.println("고양이가 털을 세우며 승질냅니다");
                    break;
                case ATC3:
                    System.out.println("고양이가 식빵을 굽습니다");
                    isNotFinish = false;
                    break;
            }
        }
    }