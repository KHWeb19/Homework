import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
         /*  반 학생이 30명이 있다.
            이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
            이 상태에서 학생들의 점수를 임의로 배치하고
            학급의 평균값을 구해보도록 한다. */
        // 1 정수 학생 30명  100점 점수 60점 미만점수를 3개 만든다
        // 2 임의로 배치 해야 하니 Math.random 사용
        // 3 for문 사용 30명 학생 성적 나오게 하고
        // 4 sum을 이용하고 평균을 나누어 출력

        // 정수 3개를 출력
        int student_num = 30;
        int Max = 100;
        int Min = 60;
        // STUDENT_NUM 배열을 만들어줌
        int[] score = new int[student_num];
        //범위 정수와 sum 정수 생성
        int sum = 0;
        int range = Max - Min + 1;
        //for 반목문 30명까지 계속 올림 지정
        for (int i = 0; i < student_num; i++) {
            // sore 점수 60~100까지 지정
            score[i] = (int) (Math.random() * range + Min);
            // 점수 합산
            sum += score[i];
            // 학생들 숫자와 점수 출력
            System.out.printf("학생들 점수[%d] : %d\n", i, score[i]);
        }
        // 평균 (float) 이용 합산 실수로 바꿔주고 / 학생수 나누기
        System.out.printf("학생들 점수 합산 : %d\n", sum);
        System.out.println("학생들 점수 평균 : " +(float) (sum) / student_num);
    }
}


