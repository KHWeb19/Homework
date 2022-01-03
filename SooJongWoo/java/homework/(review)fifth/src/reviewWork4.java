public class reviewWork4 {
    public static void main(String[] args) {
        final int STUDENT_NUM = 30; // 학생수
        final int MAX = 100; // 최대점수
        final int MIN = 60; // 최소점수

        int[] score = new int[STUDENT_NUM]; // 학생숫자만큼 배열길이 만들기

        int range = MAX - MIN + 1; // 최대값 계산
        int sum = 0; // sum은 0부터 시작한다고 지정

        for (int i = 0; i < STUDENT_NUM; i++) {
            score[i] = (int) (Math.random() * range + MIN);
            // 배열안에 난수 넣기
            sum += score[i]; // 배열안에 들어가는 숫자들 합치기

            System.out.printf("score[%d] = %d\n", i, score[i]);
        }

        System.out.println("반 평균 = " + (float)(sum) / STUDENT_NUM);
        // 난수 합에서 학생수를 나누어 평균 내기
        // 소수점으로 보이기 위해 난수 합 앞에 (float)형식으로 지정
    }
}

//  1. 학생수가 30이므로 고정값으로 두기
//  2. 시험점수가 60점 미만이 없기 때문에 MIN = 60, MAX = 100으로 두기
//  3. 학생 점수를 랜덤으로 생성하기
//  4. 학생 점수를 나열할수 있도록 배열로 풀기