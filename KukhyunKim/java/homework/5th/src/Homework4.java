public class Homework4 {
    public static void main(String[] args) {
        /*
        4. 반 학생이 30명이 있다.
           이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
           이 상태에서 학생들의 점수를 임의로 배치하고
           학급의 평균값을 구해보도록 한다.
         */

        /*
        1. 반학생들이 30명이므로 end값이 30인 배열 생성
        2. 생성된 배열에 첫학생은 60부터 시작하여 1씩 등차수열하여 배치
        3. 생성된 모든 배열의 엘리먼트를 덧셈후 나눗셈30
        4. 출력
        */

        final int STUDENT_NUM = 30;
        // 학생 넣을 상자 생성
        final int MAX = 100;
        final int MIN = 60;
        // 점수 넣을 상자를위한 범위값 상자 생성

        int[] score = new int[STUDENT_NUM];
        // 배열로 학생들 생성

        int range = MAX - MIN + 1;
        // 점수 범위값 생성

        int sum = 0;
        // 평균값구하기위한 계산식넣을 상자 생성

        for (int i = 0; i < STUDENT_NUM; i++) {
            score[i] = (int) (Math.random() * range + MIN);
            // 학생마다 랜덤 점수 부여
            sum += score[i];
            // 학생들의 점수 합산

            System.out.printf("score[%d] = %d\n", i, score[i]);
            // 출력으로 부여된 학생들 일렬로 세워서 점수확인
        }

        System.out.println("반 평균 = " + (float)(sum) / STUDENT_NUM);
        // 출력으로 학생들 점수 합산을 학생수로 나눠 평균 표현
    }
}