import java.util.Arrays;

public class HW05 {

    // 4번문제에서 표준변차와 분산을 구하자

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


        /// 5번문제 추가

        double averageDifference, studentVariance, studentStdDeviation, differenceSum = 0;

        for (int i =0; i<SIZE; i++){
            averageDifference =  Math.pow(myStudents[i] - AVERAGE,2);
            differenceSum += averageDifference;
        }

        studentVariance =  differenceSum / SIZE;

        System.out.printf("분산의 값: %.3f\n", studentVariance);

        studentStdDeviation = Math.sqrt(studentVariance);

        System.out.printf("표준편차의 값: %.3f\n", studentStdDeviation);
    }

}
