
import java.util.Scanner;

public class ScoreAverage {
    //스코어 평균값을 구하기 위한 변수를 만듬.
    public static int Korean;
    public static int English;
    public static int Mathmatics;





    //점수를 입력 받기 위한 메서드 (재활용)
    public void Subject() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요.");
        Korean = scanner.nextInt();


        System.out.print("영어 점수를 입력하세요.");
        English = scanner.nextInt();


        System.out.print("수학 점수를 입력하세요.");
        Mathmatics = scanner.nextInt();

    }
    //평균값을 출력하기 위한 메서드
    public void finalscore() {
        System.out.printf("국어 = %d 영어 = %d 수학 = %d\n",Korean ,English, Mathmatics);
        int sum = Korean + English + Mathmatics;
        int average = sum / 3;
        System.out.printf("당신의 평균은? %d\n" , average);
    }
}
