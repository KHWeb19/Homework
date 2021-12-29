public class Ans4 {
    public static void main(String[] args) {
        ////반 학생 수 불변의 30명
        final int STUDENT_NUM = 30;
        ////최고 점수 불변의 100점
        final int MAX = 100;
        ////최소 점수 불변의 60점
        final int MIN = 60;
        ////STUDENT_NUM을 score라는 정수의 배열 객체로 만듦
        int[] score = new int[STUDENT_NUM];
        ////범위 설정 60점에서 100점
        int range = MAX - MIN + 1;
        ////for문 안에서 쓰일 정수의 값 초기화
        int sum = 0;
        ////임의의 정수 i를 초기화
        ////i는 STUDENT_NUM 보다 작아야 하고,
        ////한 번 출력 후 1씩 증가해 출력
        for (int i = 0; i < STUDENT_NUM; i++) {
            ////해당 배열에 60~100 사이로 랜덤한 정수 배정
            score[i] = (int) (Math.random() * range + MIN);
            ////i번째 배열까지의 모든 결과값(score[i])을 더함
            sum += score[i];
            ////출력은 "score[0~30까지의 숫자] = 점수
            System.out.printf("score[%d] = %d\n", i, score[i]);
        }
        ////평균은 소수점까지 반영을 위해 sum을 float형태로 강제 변환
        ////결과값(점수)를 모두 더해 float형태로 만들어주고 STUDENT_NUM으로 나누면??
        System.out.println("반 평균 = " + (float)(sum) / STUDENT_NUM);
    }
}
