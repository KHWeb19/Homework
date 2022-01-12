

public class Score{

    final int SCORE_MAX = 100;
    final int SCORE_MIN = 30;

    int range = SCORE_MAX - SCORE_MIN +1;

    Subject subject = new Subject();
    int[] score;
    int sum = 0;
    float avg ,var, stdDev;

    public void initScore() {

        subject.selectSubject();

        score = new int[subject.SELECT_MAX];
        System.out.println();
        System.out.println("=======수강 과목 성적=======");

        for (int i = 0; i < subject.cnt; i++) {
            score[i] = (int) (Math.random() * range + SCORE_MIN);
            System.out.print(score[i] + " ");

            sum += score[i];




        }


    }
 //이 부분에서 멸망!
    public void average(){

        avg = (float) sum / subject.cnt;


        }
    public void Variance(){

        for (int i = 0; i < subject.cnt; i++) {
            var += Math.pow(score[i] - avg, 2);
        }

        var /= subject.cnt;
    }

    public void StandardDeviation(){

        stdDev = (float) Math.sqrt(var);

    }

    public void outputScore(){

        initScore();
        average();
        Variance();
        StandardDeviation();

        System.out.println();
        System.out.println("평균 = " + avg + " 분산 = " + var + " 표준편차 =" + stdDev);
    }


}
