public class HW05 {
    public static void main(String[] args) {
        //5. 4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
        //   힌트: Math.sqrt() - 루트 계산

        //   분산: 차이값 제곱의 평균
        //1) 평균 구하고
        //2) 각 값에서 빼준다음에 더하고 나눔

        int rand, average;
        int sum1 = 0, sum2 = 0;
        final int NUM = 30;
        final int MIN = 60;
        final int MAX = 100;
        int[] arr1 = new int[NUM];
        int[] arr2 = new int[NUM];
        //1)
        for (int i=0; i<NUM; i++) {
            rand = (int)(Math.random()*(MAX-MIN+1)+MIN);
            arr1[i] = rand;
            sum1 += arr1[i];
        }
        average = sum1/NUM;
        System.out.printf("평균: %d\n", average);
        //2)
        for (int i=0; i<NUM; i++) {
            arr2[i] = arr1[i] - average;
            sum2 += arr2[i]*arr2[i];
        }
        System.out.printf("분산: %d, 표준편차: %f", sum2/NUM, Math.sqrt(sum2/NUM));
    }
}
