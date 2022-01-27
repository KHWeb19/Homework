import java.util.Scanner;

public class Student {
    //학생 클래스에 수학,영어 국어 점수를 입력한다.

    public static final int subjectNum = 3;

    public static Scanner scan;
    public static int mathematicsscore;
    public static int englishscore;
    public static int koreanscore;

    public static int[] score;

    public static void initScore() {
        score = new int[subjectNum];
        scan = new Scanner(System.in);

        systemInit();
    }

    public static void systemInit() {

        setscore();
        System.out.printf("수학 = %d   영어 = %d   국어 = %d\n",score[0],score[1],score[2]);

        StudentManage studentManage = new StudentManage();
        studentManage.initMa();
    }
    public static void setscore(){
        System.out.print("수학 점수를 입력하세요: ");
        mathematicsscore = scan.nextInt();
        score[0] = mathematicsscore;

        System.out.print("영어 점수를 입력하세요: ");
        englishscore = scan.nextInt();
        score[1] = englishscore;

        System.out.print("국어 점수를 입력하세요: ");
        koreanscore = scan.nextInt();
        score[2] = koreanscore;
    }
}








