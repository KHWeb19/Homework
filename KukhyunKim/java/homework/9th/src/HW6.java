// 문제은행[4] - 6. 학생 클래스에 수학, 영어, 국어 점수를 입력 받도록 개조합니다.
import java.util.Scanner;

public class HW6 {
    // 국영수 점수 받을 배열 생성
    // 7, 9, 10 계산할 클래스 생성 (평균, 분산, 표준편차)
    // 점수 넣을 스캔생성

    public static final int classNum = 3;

    public Scanner scan;
    public static int mathScore;
    public static int englishScore;
    public static int koreanScore;

    public static int[] score;

    public void initScore() {
        score = new int[classNum];
        scan = new Scanner(System.in);

        scoreInit();
    }

    public void scoreInit(){
        putScore();
        System.out.printf("수학 점수 = %d 영어 점수 = %d 국어 점수 = %d\n",
                score[0],score[1],score[2]);

        HW7_9_10 calculation = new HW7_9_10();
        calculation.initcal();
    }

    public void putScore(){
        System.out.print("수학 점수 : ");
        mathScore = scan.nextInt();
        score[0] = mathScore;

        System.out.print("영어 점수 : ");
        englishScore = scan.nextInt();
        score[1] = englishScore;

        System.out.print("국어 점수 : ");
        koreanScore = scan.nextInt();
        score[2] = koreanScore;
    }
}
