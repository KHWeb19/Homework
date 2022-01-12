import java.util.Arrays;

public class Q04 {
    public static void main(String[] args) {

        // Q4. 반 학생이 30명이 있다.
        //     이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        //     이 상태에서 학생들의 점수를 임의로 배치하고 >>> for ~~~ 면 평균값은?
        //     학급의 평균값을 구해보도록 한다.


        final int MAX = 100; final int MIN = 60; final int RANGE = MAX - MIN + 1; // 점수 랜덤 생성

        final int STUDENT = 30; // 반 학생이 30명이 있다. > 30으로 지정
        int result = 0;
        int randscore;

        int[] StudentScore;
        StudentScore = new int[STUDENT]; // 길이 자체를 30으로 지정

        for (int i=0; i<STUDENT; i++){ // i가 0에서 30까지 1씩 증가하면

            randscore = (int)(Math.random()*RANGE+MIN); // randscore를 랜덤으로 뽑는다
            StudentScore[i] = randscore; // StudentScore에 i값을 넣으면 randscore이 나온다
            result += StudentScore[i]; // result는 result와 StudentScore[i]를 더한값이 나온다 (해석한게 맞을까요?)

        }
        System.out.println(Arrays.toString(StudentScore));

        final double AVERAGE = (double) result / 30;

        System.out.printf("학급 평균은 %f입니다.\n", AVERAGE);

        // 참고
        // %d:정수형, %f:실수형, %s:문자열형, %c:문자형
        // 문자형을 표현할때는 ' ' 를 이용 문자열은 " " 를 이용

    }
}
