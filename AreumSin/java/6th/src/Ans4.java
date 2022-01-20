public class Ans4 {
    public static void main(String[] args) {
        // 나는 배열에 30개의 성적을 입려해 줬음.
        // 배열에 성적을 입력하지 않고 하는 방법

        final int STUDENT_NUM = 30;
        final int MAX = 100;
        final int MIN = 60;

        int[] score = new int[STUDENT_NUM];

        int range = MAX - MIN +1;
        int sum = 0;

        for(int i = 0; i < STUDENT_NUM; i++){
            score[i] = (int)(Math.random()*range + MIN);
            sum += score[i];

            System.out.printf("score[%d] = %d\n", i, score[i]);
        }

        System.out.println("반 평균 = "+ (float)(sum)/STUDENT_NUM);
    }
}
