import java.util.Scanner;

public class Score {
    //스코어에서 사용할 변수 설정
    public static int Korean;
    public static int English;
    public static int Mathmatics;





    //점수를 입력받을 메서드를 만듬
    public void InputScore() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요.");
        Korean = scanner.nextInt();


        System.out.print("영어 점수를 입력하세요.");
        English = scanner.nextInt();


        System.out.print("수학 점수를 입력하세요.");
        Mathmatics = scanner.nextInt();

    }
    //입력받은 점수를 출력 할 메서드를 만듬.
    public void ScoreOutput() {
        System.out.printf("국어 = %d 영어 = %d 수학 = %d\n",Korean ,English, Mathmatics);
    }
}



