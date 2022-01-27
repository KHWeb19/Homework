public class Ans5 {
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
        ////평균을 내고, 분산과 표준편차를 구하기 위해 처음부터 float 적용
        float sum = 0;
        float average;

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
        ////float 으로 지정된 평균 값을 구함.
        average = sum / STUDENT_NUM;
        System.out.println("평균 = " + average);
        ////새로운 for문을 위해 sum 초기화
        sum = 0;
        ////분산과 표준편차를 구하기위해 (개인 점수-평균)^2 값 구함
        for (int i = 0; i < STUDENT_NUM; i++) {
            sum += Math.pow(score[i] - average, 2);
        }
        ////분산 = (개인의 점수-평균점수)^2/인원수
        System.out.println("분산 = " + (sum / STUDENT_NUM));
        ////표준편차 = 루트 분산.
        System.out.println("표준편차 = 루트 분산 = " + Math.sqrt(sum / STUDENT_NUM));
    }
}
