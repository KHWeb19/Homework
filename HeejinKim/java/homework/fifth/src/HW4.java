public class HW4 {

    //반 학생이 30명이 있다.
    //이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
    //이 상태에서 학생들의 점수를 임의로 배치하고
    //학급의 평균값을 구해보도록 한다.

    //-------구상---------
        //1.학생들의 점수를 랜덤으로 생성
        //2.배열은 같은 데이터타입을 처리할때 편함
        //3.평균값을 구하려면 점수,점수들의 합계 ,반 학생수
        //4.for문으로 시작
        //5.30명의 학생들의 점수를 생성할 때 배열이 필요

    public static void main(String[] args) {
        final int STUDENTS = 30;
        final int MAX=100;
        final int MIN=60;

        int[] arr = new int[STUDENTS];
        int range=MAX-MIN+1;
        int sum=0;
        int avg;


        for (int i = 0; i < STUDENTS; i++) {
            // i=0 으로 설정해줌

            int score = (int) (Math.random()*range+MIN);//for문 안에 배치헤야 계속 랜덤값이 생성됨
            //score[i]= (int) (Math.random()*range+MIN);
            arr[i]=score;                               //배열안에 생성된 랜덤 점수들을 넣어줌
            System.out.printf("%d\n", arr[i]);          //반 학생들의 점수를 모두 출력

            sum+=arr[i];                                //생성된 배열안의 점수들의 합

        }
        avg= sum/ STUDENTS;
        System.out.printf("합계:%f\n",(float)sum);//for문 밖에 배치
        //평균은 float로 정의해줌.
        System.out.printf("반 평균:%d",avg);
    }
}