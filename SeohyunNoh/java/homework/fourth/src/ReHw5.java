public class ReHw5 {
    public static void main(String[] args) {
        final int STUDENT = 30;
        final int MAX = 100;
        final int MIN = 60;

        int[] score = new int[STUDENT];

        int range = MAX - MIN + 1;
        float sum = 0;
        float avg;

        for(int i = 0 ; i < STUDENT ; i++){
            score[i] = (int)(Math.random() * range + MIN);

            System.out.printf("score[%d]의 점수 : %d\n", i, score[i]);
            sum += score[i];
        }

        avg = sum / STUDENT;
        System.out.printf("평균점수 : %f\n", avg);

        sum = 0;

        //편차의 총합 구하기
        for(int i = 0; i < STUDENT ; i++){
            sum += Math.pow(score[i] - avg, 2);
        }

        System.out.println("분산 : " + sum / STUDENT);
        System.out.println("표준편차 : " + Math.sqrt(sum / STUDENT));
    }
}
