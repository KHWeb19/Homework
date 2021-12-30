public class M5 {
    public static void main(String[] args) {
        //4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다
        //분산(variance)->차이값의 제곱의 평균-> (관측값-average)^2/전체 수
        //표준 편차(standard deviation)->분산의 제곱근 ->(int)루트 분산
        final int START = 0;

        final int END=30;
        final int MAX=100;
        final int MIN=60;

        int[]score=new int[END];

        int range=MAX-MIN+1;
        int sum=0;

        for (int i = START; i<END ; i++){

            score[i]=(int)(Math.random()*range+MIN);
            //범위내 랜덤점수 30개
            sum+=score[i];
            //점수 합산
            System.out.printf("score[%d] = %d\n", i, score[i]);
        }
        float aver = ((float) sum / END);
        System.out.printf("학생수 30명의 임의의 평균 점수는 %f이다\n",aver);
        //합산 점수/인원 +> 평균

        float variance ;
        float standardDeviation;
        //5번
        float sum2=0;
        for (int i =START; i<END; i++) {
            sum2 += Math.pow(score[i]-aver,2);
        }
            variance =sum2/END;
            standardDeviation = (float)Math.sqrt(sum2 / END);
            System.out.printf("분산의 값은 %f이다\n", variance);
            //분산(variance)->차이값의 제곱의 평균-> (관측값-average)^2/전체 수
            System.out.printf("표준편차의 값은 %f이다\n", standardDeviation);
            //표준 편차(standard deviation)->분산의 제곱근 ->(int)루트 분산

        }


    }
