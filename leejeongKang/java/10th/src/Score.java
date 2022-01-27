import java.util.Scanner;
public class Score {

    final int ARR_MAX = 10;
    final int SCORE_MAX = 100;
    final int SCORE_MIN = 30;

    int range;
    int[] score;
    String[] scoreName;
    Scanner scan;

    float mean;

    int cnt;

    public void initScore(){
        scan = new Scanner(System.in);
        cnt =0;

        addSubject();
        inputScore();
        calcMean();
    }

    public void setRange() {range = SCORE_MAX-SCORE_MIN +1;}

    public void inputScore(){
        score = new int [cnt];

        setRange();

        for (int i =0; i<cnt;i++){
            score[i] = (int) (Math.random()*range+SCORE_MIN);
        }
    }
    public boolean checkInput() {
        System.out.println("계속 입력하시겠습니까? yes or no :");

        while(true){
            String YorN = scan.nextLine();

            if (YorN.equals("n")){
                return false;
            }else if (YorN.equals("y")){
                System.out.println("다음 과목을 입력하세요");
                return true;
            }else{
                System.out.println("재입력 하세요 :");
            }
        }
    }
    public void addSubject(){
        String[] backup = new String[ARR_MAX];

        System.out.println("다루고 싶은 과목을 입력하세요 :");

        do{
            backup[cnt++] = scan.nextLine();
        }
        while (checkInput());

        scoreName = new String [cnt];

        for (int i =0; i< cnt; i++){
            scoreName[i] = backup[i];
        }
    }

    public void calcMean(){
        mean = 0;
        for (int i =0; i<cnt; i++){
            mean+=score[i];
        }

        mean/= cnt;
    }

}
