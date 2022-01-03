public class HW5 {
    public static void main(String[] args) {

        //분산 공식 = (점수 - 평균)^2 의 합 /학생수
        final int STUDENT_NUM = 30;
        final int MAX = 100;
        final int MIN = 60;

        int range = MAX - MIN + 1;
        float sum = 0;

        int[] score = new int[STUDENT_NUM];
        float sqrtSum=0;


        for (int i = 0; i < STUDENT_NUM; i++) {
            score[i] = (int) (Math.random() * range + MIN);
            sum += score[i];
            System.out.printf("score[%d]=%d\n", i, score[i]);

        }
        float avg= sum / STUDENT_NUM;
        System.out.printf("합계=%.1f\n평균=%.2f\n", sum, avg);

        for (int i=0;i<STUDENT_NUM; i++){
            sqrtSum+=Math.pow(score[i]-avg,2);
        }
        System.out.printf("분산=%.2f\n표준편차=%.2f",sqrtSum/STUDENT_NUM,Math.sqrt(sqrtSum/STUDENT_NUM));
    }
}
