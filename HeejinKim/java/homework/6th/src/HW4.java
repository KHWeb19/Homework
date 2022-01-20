public class HW4 {  /*  반 학생이 30명이 있다.
            이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
            이 상태에서 학생들의 점수를 임의로 배치하고
            학급의 평균값을 구해보도록 한다. */
    public static void main(String[] args) {
        //1.변수 지정  고정값 (30명 , 60점 이상 ,100점 이하)
        //2.점수를 임의로 배치 ---랜덤값 부여
        //3.학생들의 30명의 배열에 점수를 랜덤값으로 부여하고 평균값을 구함

        final int STUDENT_NUM= 30;
        final int  MAX=100;
        final int MIN=60;

        int range= MAX- MIN+1;
        int sum=0;
        int [] score= new int [STUDENT_NUM];

        for(int i=0;i<STUDENT_NUM;i++){

            score[i]=(int)(Math.random()*range+MIN);

            sum+=score[i];
            System.out.printf("score[%d]=%d\n",i,  score[i]);

        }
        System.out.printf("합계=%d\n평균=%.2f",sum,(float)(sum)/STUDENT_NUM);
    }

}
