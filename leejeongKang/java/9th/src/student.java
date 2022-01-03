import java.util.Scanner;
public class student {

    public String name;
    public int grade;
    //학생 기본정보

    static int subjectNum = 3;                                  // 과목 수
    public final int MAX = 100;                                 // 점수의 최댓값과 최솟값
    public final int MIN = 0;

    String[] subject = new String[]{"국어", "영어", "수학"};      ///과목 이름 문자 배열
    static int[] score = new int[subjectNum];                  /// 과목의 점수 배열
    boolean isTrue = true;


    public void InputScore() {
        for (int i = 0;i <subjectNum; i++) {
                System.out.printf("%s 성적을 입력하세요.", subject[i]);
                Scanner scan = new Scanner(System.in);
                score[i] = scan.nextInt();

                while (isTrue){                                     /////입력된 점수값이 0~100을 벗어날 때 무한루프
                if (score[i] > MAX || MIN > score[i]){
                    System.out.println("올바른 값을 입력하시오.");
                    score[i] = scan.nextInt();
                }
                else {
                    break;
                }
                }
            System.out.println(score[i]);
        }

    }
}
