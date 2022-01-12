public class HW5_1 {

    public static void main(String[] args) {
        final int STUDENTS = 30;
        final int MAX = 100;
        final int MIN = 60;

        int[] score = new int[STUDENTS];
        int range = MAX - MIN + 1;
        float sum = 0;
        float avg;


        for (int i = 0; i < STUDENTS; i++) {
            score[i] = (int) (Math.random() * range + MIN);
            //배열안에 생성된 랜덤 점수들을 넣어줌
            System.out.printf("%d\n", score[i]);          //반 학생들의 점수를 모두 출력

            sum += score[i];                                //생성된 배열안의 점수들의 합

        }
        avg = sum / STUDENTS;
        System.out.printf("합계:%f\n", sum);
        System.out.printf("반 평균:%f\n", avg);

        for(int i=0;i < STUDENTS; i++){
            sum+=Math.pow(score[i]-avg,2);

        }
        System.out.printf("분산:%f",sum/ STUDENTS);
    }
}
