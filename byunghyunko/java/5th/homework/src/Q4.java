import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //4. 반 학생이 30명이 있다.
        //이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        //이 상태에서 학생들의 점수를 임의로 배치하고
        //학급의 평균값을 구해보도록 한다.

        // Q질문 . 학생들의 배치를 임의로 작성해봤으나 맞는 코드인지 모르겠습니다
        // 이후 해설 강의 듣고 코드를 정리했습니다.


        final int STUDENT = 30; // 반 학생의 수 30명
        final int MAX = 100 // 100점 만점
        final int MIN = 60 // 최하점이 60점 이하

        int range = MAX - MIN + 1; // 범위값 지정

        int[] arr = new int[STUDENT]; // 배열 작성

        int sum = 0;

        // 학생들의 점수를 임의로 배치
        for (int=0; i <= STUDENT; i++){
            arr[i] = (int) (Math.random() * range + MIN);

            sum + = arr[i];

            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
        // 학생들의 평균값을 구해라
        // 학습의 평균값 = 학생들의 총점 / 반 학생 수
        System.out.println("평균값= " + sum/STUDENT);
    }
}