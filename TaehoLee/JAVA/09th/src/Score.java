import java.util.Arrays;
import java.util.Scanner;

public class Score{

    final int MAXSCORE = 100;
    final int MINSCORE = 60;

    private int[] scoreArr;

    Subject subject = new Subject();

    private int subjectCount = subject.getSubjectCount();
    private String[] subjectName = subject.getSubjectName();

    private float averagescore;
    private float varscore;
    private float stdscore;

    Scanner scan;

    public void calcScore(){
        scan = new Scanner(System.in);
        addScore();
        averageScore();
        varScore();
        stdScore();
    }

    public void addScore() {

        scoreArr = new int[subjectCount];

        for (int i = 0; i < subjectCount; i++) {
            System.out.printf("%s 과목의 점수를 입력해주세요(점수는 %d ~ %d 사이입니다).", subjectName[i], MINSCORE, MAXSCORE);

            int subjectScore = scan.nextInt();

            if ((subjectScore >= MINSCORE) && (subjectScore <= MAXSCORE)){
                scoreArr[i] = subjectScore;
            }
            else{
                System.out.println("점수를 다시 입력해주세요!");
                i--;
            }
        }
    }

    public void averageScore(){
        float sum = 0;

        for(int i = 0; i < subjectCount; i++){
        sum += scoreArr[i];
        }
        averagescore = sum / subjectCount;
    }

    public void varScore() {
        float varsum = 0;

        for(int i = 0; i <subjectCount; i++){
            varsum += Math.pow((scoreArr[i] - averagescore), 2);
        }
        varscore = varsum / subjectCount;
    }
    public void stdScore(){
        stdscore = (float) Math.sqrt(varscore);
    }

    @Override
    public String toString() {
        return "Score { " + "\n" +
                "subjectname = " + Arrays.toString(subjectName) + "\n" +
                "score = " + Arrays.toString(scoreArr) + "\n" +
                "mean = " + averagescore +
                " ,var = " + varscore +
                " ,stdDev = " + stdscore + "\n" +
                '}';
    }
}