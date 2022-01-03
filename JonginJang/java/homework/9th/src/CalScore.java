import java.util.Arrays;

public class CalScore {//문제5,6,7,9,10
    //표준편차 : 분산에 루트
    //분산: 각 편차들(값과 평균치의 차이)들을 제곱한 다음 더해주고 전체 숫자로 나눈다.  */

    static final int SUBJECT = 3; //1: 수학, 2. 영어, 3. 국어
    static final int STUDENT = 5;
    static final int SCOREMIN = 60;
    static final int SCOREMAX = 100;
    int range = SCOREMAX - SCOREMIN + 1;
    int i,j,temp,tempSum;

    int [][] scores;
    int [] sumScore;
    int [] scoreAvg;
    int [] scoreDev;

    public void initCalScore(){
        scores = new int[SUBJECT][STUDENT];
        sumScore = new int[SUBJECT];
        scoreAvg = new int[SUBJECT];
        scoreDev = new int[SUBJECT];

    }
    public void addScore(){
        for(i=0;i<SUBJECT;i++){
            if(i==0){
                System.out.println("수학 성적 입력");
            }
            else if(i==1){
                System.out.println("영어 성적 입력");
            }
            else if(i==2){
                System.out.println("국어 성적 입력");
            }

            for(j=0;j<STUDENT;j++){
               scores[i][j] = (int)(Math.random()*range+SCOREMIN);
               sumScore[i] += scores[i][j];
            }
        }
        System.out.println("");
    }
    public void getAvg(){
        for(i=0;i<SUBJECT;i++){
            scoreAvg[i] = sumScore[i]/STUDENT;
            System.out.printf("%d번째 과목의 평균 = %d\n",i+1,scoreAvg[i]);
        }
        System.out.println("");
    }

    public void getDev(){
        for(i=0;i<SUBJECT;i++){
            if(i==0){
                System.out.println("수학 성적 분산계산");
            }
            else if(i==1){
                System.out.println("영어 성적 분산 계산");
            }
            else if(i==2){
                System.out.println("국어 성적 분산 계산");
            }

            for(j=0;j<STUDENT;j++){
                temp = 0;
                temp = scores[i][j] - scoreAvg[i]; //편차
                temp = (int)Math.pow(temp,2); //편차의 제곱
                tempSum += temp;// 편차 제곱의 합

            }
            scoreDev[i] = tempSum/STUDENT;
            System.out.printf("%d번째 과목의 분산 : %d\n",i+1,scoreDev[i]);
            System.out.printf("%d번째 과목의 표준편차 : %d\n",i+1,(int)Math.sqrt(scoreDev[i]));
        }
        System.out.println("");
    }

}
