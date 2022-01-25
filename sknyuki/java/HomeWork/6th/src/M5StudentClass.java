import java.util.Scanner;

public class M5StudentClass {
    //Scanner scan=new scanner로 국,영,수 점수를 입력 받는다.
    //static으로 각 점수들을 받는다.
    //평균을 구하는 변수를 만든다.
    M5StudentAverage average;
    Deviation deviation;
    Variance variance;

    static Scanner scan = new Scanner(System.in);
    static int score1;
    static int score2;
    static int score3;
    static final int END = 3;

    public void setscore1() {

        System.out.println("국어 점수를 입력하세요");
        score1 = scan.nextInt();

        System.out.println("영어 점수를 입력하세요");
        score2 = scan.nextInt();

        System.out.println("수학 점수를 입력하세요");
        score3 = scan.nextInt();}

    public void initaver(){//평균
            average = new M5StudentAverage();
            average.initaverage();
        }
    public void initdev(){//표준편차
        deviation = new Deviation();
        deviation.initDeviationScore();
    }
    public void initvar(){//분산
        variance = new Variance();
        variance.initVariancescore();
    }

}

