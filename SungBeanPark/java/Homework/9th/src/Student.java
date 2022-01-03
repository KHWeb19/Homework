import java.util.Scanner;

//다못했습니다...

//학생수를 넣고 학생과목마다 점수 랜덤하게 넣어?

public class Student {
    public String name;
    public int math;
    public int korean;
    public int english;
    public float sum;
    public float avg;
    public double dev;
    public double devSqvSum;
    public double var;
    public double std;
    public static final int SUBJECT_NUMBERS = 3;
    public static int[] score = new int[SUBJECT_NUMBERS];

    Scanner scan = new Scanner(System.in);

    public void setName(String name){
        this.name = name;
    }

    public void initScore() {
        for (int i = 0; i < score.length; i++) {
            System.out.println("언 수 외 순으로 성적을 입력해주세요: ");
            score[i] = scan.nextInt();
        }
        System.out.println("점수: " + score[0] + score[1] + score[2]);
    }

    public void sumScore() {
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
            System.out.println(sum);
        }
    }

    public void avgScore(){
        avg = sum / SUBJECT_NUMBERS;
        System.out.println(avg);
    }

    public void varScore(){
        for (int i = 0; i < SUBJECT_NUMBERS; i++) {
            dev = (score[i] - avg);
            devSqvSum += dev*dev;
        }
        var = devSqvSum / SUBJECT_NUMBERS;
        std = Math.sqrt(var);
        System.out.print("\n분산:" + var + "\n표준편차:" + std );
    }

}
