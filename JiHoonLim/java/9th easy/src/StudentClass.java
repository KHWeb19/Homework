import java.util.Scanner;

public class StudentClass {
    /*
    1. 수학, 영어, 국어 점수를 입력 받는다 -> Scanner 이용
     */

    public static final int classNum = 3;

    public Scanner scan;
    public static int mathscore;
    public static int englishscore;
    public static int koreanscore;

    public static int[] score;

    public void initScore(){
        score = new int[classNum];
        scan = new Scanner(System.in);

        systemInit();
    }

    public void systemInit(){

        putScore();
        printScore();

        StudentOperation studentOperation = new StudentOperation();
        studentOperation.initOp();

    }


    public void putScore(){
        System.out.print("수학 점수를 입력하세요.");
        mathscore = scan.nextInt();
        score[0] = mathscore;

        System.out.print("영어 점수를 입력하세요.");
        englishscore = scan.nextInt();
        score[1] = englishscore;

        System.out.print("국어 점수를 입력하세요.");
        koreanscore = scan.nextInt();
        score[2] = koreanscore;
    }

    public void printScore(){
        System.out.printf("수학 = %d 영어 = %d 국어 = %d\n",score[0],score[1],score[2]);
    }

}
