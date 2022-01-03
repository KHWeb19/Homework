import java.util.Scanner;

public class StudentScore {

    // 학생 클래스에 수학, 영어, 국어 점수를 입력 받도록 개조합니다.
    final int Subject=3;
    int math;
    int english;
    int korean;
    Scanner scan;
    int[]score;
    int i;
    float avg;
    int sum=0;


    public void initScore(){

        score = new int[Subject];
        scan = new Scanner(System.in);

        avg();


    }
    public void printScore(){
        addScore();
        System.out.printf("수학=%d,영어=%d,국어=%d",score[0],score[1],score[2]);
    }

    public void addScore(){
        System.out.println("수학점수를 입력하세요:");
        math= scan.nextInt();
        score[0]=math;

        System.out.println("영어점수를 입력하세요:");
        english= scan.nextInt();
        score[1]=english;

        System.out.println("국어점수를 입력하세요:");
        korean= scan.nextInt();
        score[2]=korean;
    }

    public void avg(){
        addScore();

        for(int i=0;i< Subject;i++){
            sum+=score[i];
        }
        avg=(float) sum/ Subject;
        //return avg;
    }





}
