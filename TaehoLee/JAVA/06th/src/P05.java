public class P05 {
    // 30명이있음
    // 60점 미만 없음(최대값 100)
    // 학생들의 점수를 임의로 배치하고
    // 표준편차, 분산을 구함

    public static void main(String[] args) {
        final int STUDENT_NUM = 30;
        final int MIN = 60;
        final int MAX = 100;
        float sum = 0;
        float var = 0;

        int range = MAX - MIN + 1;
        int[] score= new int[STUDENT_NUM];

        for(int i = 0; i < STUDENT_NUM; i++){
            score[i] = (int)(Math.random()*range) + MIN;
            sum += score[i];
        }
        float average = sum/STUDENT_NUM;
        System.out.println("평균 : " + average);

        for (int i = 0; i < STUDENT_NUM; i++){ // 분산 구하기
            var += Math.pow(score[i] - average,2); // Math.pow(a,b) = a^b ---- a가 음수일때 a^b를 계산하면 음수가나옴!!
        }
        System.out.printf("분산 : %f\n표준편차 : %f", var/STUDENT_NUM, (float)Math.sqrt(var/STUDENT_NUM));
    }
}
