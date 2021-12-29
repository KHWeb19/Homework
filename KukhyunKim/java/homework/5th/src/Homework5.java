public class Homework5 {
    public static void main(String[] args) {
        /*
        5. 4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
        힌트: Math.sqrt() - 루트 계산
         */

        /*
        1. 반학생들이 30명이므로 end값이 30인 배열 생성
        2. 생성된 배열에 첫학생은 60부터 시작하여 1씩 등차수열하여 배치
        3. 생성된 모든 배열의 엘리먼트를 덧셈후 나눗셈30
        4. 출력
        */

        final int STUDENT_NUM = 30;
        // 학생들 넣을 박스 생성
        final int MAX = 100;
        final int MIN = 60;
        // 학생들 점수 범위를위한 박스생성

        int[] score = new int[STUDENT_NUM];
        // 학생들 배열로 일렬로 세우기

        int range = MAX - MIN + 1;
        float sum = 0;
        float average;
        // 점수 범위 박스 생성,
        // 학생들 점수 합산을위한 박스 생성
        // 합산된 점수를 평균내기위한 박스생성

        for (int i = 0; i < STUDENT_NUM; i++) {
            score[i] = (int) (Math.random() * range + MIN);
            // 학생마다 점수 지정
            sum += score[i];
            // 지정된 학생들 점수 합산

            System.out.printf("score[%d] = %d\n", i, score[i]);
            // 지정된 학생들 줄세워서 점수 확인
        }

        average = sum / STUDENT_NUM;
        // 평균 = 모든점수 총합 / 학생수 로 평균 상자 생성
        System.out.println("평균 = " + average);
        // 평균값 출력

        sum = 0;
        // 생성된 학생들 점수 합산을위한 박스를 비우고
        // 표준편차와 분산을위한 빈박스화 시킴

        for (int i = 0; i < STUDENT_NUM; i++) {
            sum += Math.pow(score[i] - average, 2);
            // 학생마다 개인점수에서 평균을 뺀후 2제곱을함
        }

        System.out.println("분산 = " + (sum / STUDENT_NUM));
        // 계산된 값을 학생들수로 나눠 분산 표현하여 출력
        System.out.println("표준편차 = 루트 분산 = " + Math.sqrt(sum / STUDENT_NUM));
        // 계산된 값을 학생수로 나눈뒤 루트를씌워서 표준편차를 표현하여 출력
    }
}
/*  for (int i = 0; i < STUDENT_NUM; i++) {
        sum += Math.pow(score[i] - average, 2);
        // 학생마다 개인점수에서 평균을 뺀후 2제곱을함

        Q1. 어떤학생은 평균보다 값이낮으면 음수가되는데 그상태에서 홀수값의 제곱을 하게되면
            음수로표현이되는데 그값을 양수로 받아서 사용하고싶을땐 어떻게 표현해야하는지 궁금합니다.
            ex) -3의 3제곱의경우 -27인데 수식표현으로 |-27| = 27 로 표현하면될텐데,
               ||<<-- 해당표현은 어떻게해야하는지 궁금합니다. */