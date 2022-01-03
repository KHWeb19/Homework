public class M4 {
    public static void main(String[] args) {
        //반 학생이 30명이 있다.
        //   이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        //   이 상태에서 학생들의 점수를 임의로 배치하고
        //   학급의 평균값을 구해보도록 한다.

        //반 학생 30명 final END=30
        //점수의 값을 final MAX=100와 final MIN=60으로 설정
        //성적의 range값을 MAX-MIN+1
        //무작위 점수 Math.random*range+MIN

        //임의의 학생 한명한명을 배열로 점수를 대입 int[]arr=score(for문)
        //점수 합산 sum+=arr[i];
        //average구하기


        final int START = 1;

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
        }
        double aver = ((double) sum / END);
        System.out.printf("학생수 30명의 임의의 평균 점수는 %f이다",aver);
        //합산 점수/인원 +> 평균

    }
}


