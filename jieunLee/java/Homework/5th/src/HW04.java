public class HW04 {
    public static void main(String[] args) {
        //4. 반 학생이 30명이 있다.
        //   이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        //   이 상태에서 학생들의 점수를 임의로 배치하고
        //   학급의 평균값을 구해보도록 한다.

        //1) 30명 배열만들어서 랜덤값(60~100) 넣기
        //2) 배열의 총합에서 나누기30

        final int NUM = 30;
        final int MIN = 60;
        final int MAX = 100;

        int sum = 0;
        int[] arr = new int[NUM];

        for (int i = 0; i < NUM; i++) {
            arr[i] = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            System.out.printf("arr[%d]= %d\n", i, arr[i]);
            sum += arr[i];
        }
        System.out.println("총합: " + sum);
        System.out.println("평균: " + (float)sum/NUM);
    }
}
