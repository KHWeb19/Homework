import java.util.Scanner;

public class Score {

    private Scanner scan;
    static double sum = 0;
    static double mathScore = 0 , koreanScore = 0 , englishScore = 0 ;

    public void initScore(){


        System.out.print("수학 점수를 입력하시오 : ");
         scan = new Scanner(System.in);
           mathScore = scan.nextInt();

        System.out.print("국어 점수를 입력하시오 : ");
        scan = new Scanner(System.in);
          koreanScore = scan.nextInt();

        System.out.print("영어 점수를 입력하시오 : ");
        scan = new Scanner(System.in);
          englishScore = scan.nextInt();

       sum = mathScore + koreanScore + englishScore;





    }
}
