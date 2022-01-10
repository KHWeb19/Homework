
public class Score {

    static final int STUDENT = 30;
    static final int SUBJECT_NUM= 3;
    final int SCORE_MAX = 100;
    final int SCORE_MIN = 0;

    int range = SCORE_MAX - SCORE_MIN + 1;
    int[][] score = new int[SUBJECT_NUM][STUDENT];
    int sum[] = new int[SUBJECT_NUM];

   //30명 수학점수
   /* public void mathScore(){
                for(int i = 0; i < 30; i++){
                    score[i] = (int)(Math.random()*range+SCORE_MIN);

                    mathSum += score[i];
              }
    }
    //30명 국어점수
    public void koreanScore(){
                for(int i = 0; i < 30; i++){
                    score[i] = (int)(Math.random()*range+SCORE_MIN);

                    koreanSum += score[i];
              }
    }
    //30명 영어점수
    public void englishScore(){
                for(int i = 0; i < 30; i++){
                    score[i] = (int)(Math.random()*range+SCORE_MIN);

                    englishSum += score[i];
              }
    }*/

    //똑같은게 계속 중복으로 작동되어서 밑에 있는걸로 바꿔봄
        public void scoreAll(){
            for(int i = 0; i < SUBJECT_NUM; i++){
                    for(int j = 0; j < STUDENT; j++){

                    score[i][j] = (int)(Math.random()*range+SCORE_MIN);

                    sum[i] += score[i][j];

            }
        }

    }
}
