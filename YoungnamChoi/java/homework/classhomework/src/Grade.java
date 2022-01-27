import java.util.Scanner;

public class Grade {
    //점수를 입력받는 클래스

   static final int CLASS =3;

    private int math;
    private int english;
    private int korean;

    static int[]score ;
    private Scanner sc;

    public void initScore(){
        score = new int[CLASS];
        sc = new Scanner(System.in);

        systemInit();
    }
    public void systemInit(){
        addScore();
        System.out.printf("수학 = %d 영어 = %d 국어 = %d\n",score[0],score[1],score[2]);
    }
    public void addScore(){
        System.out.print("수학 점수를 입력하세요.");
        math=sc.nextInt();
        score[0]=math;

        System.out.print("영어 점수를 입력하세요.");
        english=sc.nextInt();
        score[1]=english;

        System.out.print("국어 점수를 입력하세요.");
        korean=sc.nextInt();
        score[2]=korean;
    }

}
