import jdk.swing.interop.SwingInterOpUtils;

public class Ans5 {
    public static void main(String[] args) {
        final int STUDENT_NUM = 30;
        final int MAX = 100;
        final int MIN = 60;

        int[] score = new int[STUDENT_NUM];

        int range = MAX - MIN +1;
        float sum = 0;
        float average;

        // 평균을 구하는 공식.
        for(int i = 0; i < STUDENT_NUM; i++){
            score[i] = (int)(Math.random()*range + MIN);
            sum += score[i];

            System.out.printf("score[%d] = %d\n", i, score[i]);
        }

        average = sum/STUDENT_NUM;
        System.out.println("평균은 "+average);

        for (int i =0; i < STUDENT_NUM; i++){
            sum += Math.pow(score[i] - average, 2);
        }

        System.out.println("분산은 "+(sum/ STUDENT_NUM));
        System.out.println("표준 편차 ="+ Math.sqrt(sum/ STUDENT_NUM));

    }

}
