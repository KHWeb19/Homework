import java.util.Scanner;

public class Score {
    private Scanner scan;

    //학생수만큼 각각의 과목에 배열을 할당함
    int[] mathScore = new int[StudentClass.STUDENT];
    int[] englishScore = new int[StudentClass.STUDENT];
    int[] koreanScore = new int[StudentClass.STUDENT];

    float sum;
    float average;
    
    public void initScore() {
        // 수학, 영어, 국어 성적 입력하는 enterScore매서드 호출

        scan = new Scanner(System.in);

        enterScore();
    }

    public void enterScore() {
        // 학생수만큼 루프를 돌면서 수학,영어,국어 성적을 입력받고
        // 그 총합을 구하고싶은데
        // 아래처럼 코드를 짜면 효율성이 떨어지는 거 같음. 더 깔끔한 방법이 있을 거 같은데
        for (int i = 0; i < StudentClass.STUDENT; i++) {
            System.out.print("수학 점수를 입력하시오 : ");
            mathScore[i] = scan.nextInt();

            System.out.print("영어 점수를 입력하시오 : ");
            englishScore[i] = scan.nextInt();

            System.out.print("국어 점수를 입력하시오 : ");
            koreanScore[i] = scan.nextInt();

            sum += mathScore[i] + englishScore[i] + koreanScore[i];
        }
        averageScore();
    }

    public void averageScore(){
        average = sum / StudentClass.STUDENT;
        System.out.println("평균 점수 = " + average);

        varAndStd();
    }

    public void varAndStd(){
        sum = 0;

        for (int i = 0; i < StudentClass.STUDENT; i++){
            sum += Math.pow((mathScore[i]+koreanScore[i]+englishScore[i])-average, 2 );
        }
        System.out.println("분산 = " + sum / StudentClass.STUDENT);
        System.out.println("편차 = " + Math.sqrt(sum / StudentClass.STUDENT));
    }
}
