public class class30TestManager {

    private int END;
    private int MAX;
    private int MIN;
    private int[] score;
    private int range;
    public class30TestManager( int MAX, int MIN) {
        this.MAX=MAX;
        this.MIN=MIN;


        range = MAX - MIN + 1;
        System.out.println(range);

    }
        public void randomscore(int studentNum) {
        int sum=0;
           score = new int[studentNum];
            for (int i = 0; i < studentNum; i++) {

                score[i] = (int) (Math.random() * range + MIN);
                //범위내 랜덤점수 30개
                sum += score[i];
                //점수 합산
                System.out.printf("score[%d] = %d\n", i, score[i]);}

                double aver = ((double) sum / studentNum);
                System.out.printf("학생수 30명의 임의의 평균 점수는 %f이다", aver);
                //합산 점수/인원 +> 평균
            }

            }

