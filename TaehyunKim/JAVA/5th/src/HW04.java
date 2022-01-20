import java.util.Arrays;

public class HW04 {
    // 30명의 학생
    // 모든 학생은 61점 이상이다
    // 점수를 임의로 배치하고 학급의 평균값을 구하자

    public static void main(String[] args) {
        int MIN = 61;
        int MAX = 100;
        int RANGE = MAX - MIN + 1;

        final int SIZE = 30;

        int result = 0, randomScore;

        int[] myStudents = new int[SIZE];

        for (int i = 0; i<SIZE; i++){

            randomScore = (int) (Math.random() * RANGE + MIN);

            myStudents[i] = randomScore;
            result += myStudents[i];
        }
        System.out.println(Arrays.toString(myStudents));

        final double AVERAGE = (double) result / SIZE;

        System.out.printf("반 평균은 %.2f입니다.\n", AVERAGE);

    }
}
