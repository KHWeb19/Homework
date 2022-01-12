import java.util.Scanner;

public class Score {

    private Scanner scan;
    int sum = 0;

    public void initScore(){


        System.out.print("수학 점수를 입력하시오 : ");
         scan = new Scanner(System.in);
         int mathScore = scan.nextInt();

        System.out.print("국어 점수를 입력하시오 : ");
        scan = new Scanner(System.in);
        int koreanScore = scan.nextInt();

        System.out.print("영어 점수를 입력하시오 : ");
        scan = new Scanner(System.in);
        int englishScore = scan.nextInt();

       sum = mathScore + koreanScore + englishScore;







    }
}
