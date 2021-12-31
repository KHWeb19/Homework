import java.util.Scanner;

public class Num5Student {
    private float math = 0;
    private float english = 0;
    private float korean = 0;
    private float sum=0;
    private float sum2=0;
    private float avg = 0;
    private int subjectNum = 3;
    private Scanner scan;
    private float [] subject = new float[subjectNum];
    // 배열을 자동으로 순서대로 저장하게되는건 없겠쬬?


    public void scanner(){
        scan = new Scanner(System.in);
    }

    public void math(){
        System.out.print("수학 값 입력");
        scanner();
        math=scan.nextFloat();
        subject[0]=math;
    }
    public void english(){
        System.out.print("영어 값 입력");
        scanner();
        english=scan.nextFloat();
        subject[1]=english;
    }
    public void korean(){
        System.out.print("영어 값 입력");
        scanner();
        korean=scan.nextFloat();
        subject[2]=korean;
    }
    public void avg(){
        sum= math+english+korean;
        avg= sum/subjectNum;
        System.out.printf("합산 : %.2f, 평균 : %.3f\n",sum,avg);
    }
    public void dispersion(){
        math();english();korean();avg();
        for(int i=0;i<subjectNum;i++){
            sum2+=Math.pow(subject[i] - avg, 2);
        }
        System.out.println("분산 값" + (sum2 / subjectNum));
        System.out.println("표준편차 = 루트 분산 = " + Math.sqrt(sum2 / subjectNum));


    }


}
