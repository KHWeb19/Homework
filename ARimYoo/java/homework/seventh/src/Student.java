import java.util.Scanner;

public class Student {

    final int subjectnum = 3;

    // 입력 받는다 = Scanner
    public Scanner scan = new Scanner(System.in);

    // 과목을 저장하는 배열하나, 과목 점수를 저장하는 배열하나
    public String[] subject = {"수학", "영어", "국어"};
    public int[] subScore = new int[subjectnum];

    // 점수 값 print 메서드
    public void setScore() {

        putScore();
        for (int i = 0; i < subjectnum; i++) {
            System.out.printf("%s 점수 : %d\n", subject[i], subScore[i]);
        }
    }

    // 수학, 영어, 국어 점수를 입력 받는 메서드
    public void putScore() {

        for (int i = 0; i < subjectnum; i++) {
            System.out.printf("%s 성적을 입력해주세요 : ", subject[i]);
            int subjectScore = scan.nextInt();

            if (subjectScore > 100) {
                System.out.println("결과값을 초과했습니다. 다시 입력해주세요");
                // 어떻게 100점을 넘길시 다시 해당 성적을 입력받게 할까,,?
            } else {
                subScore[i] = subjectScore;
            }

        }
    }
}