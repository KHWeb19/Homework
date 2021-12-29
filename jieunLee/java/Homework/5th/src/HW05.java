public class HW05 {
    public static void main(String[] args) {
        //5. 4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
        //   힌트: Math.sqrt() - 루트 계산

        //   분산: 차이값 제곱의 평균
        //1) 평균 구하고
        //2) 각 값에서 빼준다음에 더하고 나눔

        final int NUM = 30;
        final int MIN = 60;
        final int MAX = 100;

        float sum, average;
        int[] arr = new int[NUM];

        sum = 0;
        for (int i=0; i<NUM; i++) {
            arr[i] = (int)(Math.random()*(MAX-MIN+1)+MIN);
            sum += arr[i];
        }
        average = sum/NUM;
        System.out.println("평균: " + average);

        sum = 0;
        for (int i=0; i<NUM; i++) {
            sum += (arr[i] - average)*(arr[i] - average);
        }
        System.out.println("분산: " + sum/NUM);
        System.out.println("표준편차: " + Math.sqrt(sum/NUM));
    }
}
