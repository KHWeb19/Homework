public class Num5 {
    public static void main(String[] args) {
        /*
        4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
        힌트: Math.sqrt() - 루트 계산
         */
        /*
        표준편차란?
        분산이란?
         */

        final int STUDENT = 30;
        int []arr = new int[STUDENT];

        final int MAX = 100;
        final int MIN = 60;
        int range = MAX - MIN +1;
        int rand = 0;
        int sum = 0;

        for(int i=0;i<STUDENT;i++){
            arr[i] = (int)(Math.random()*range+MIN);
            sum += arr[i];
        }
        int avg = sum/STUDENT;

        System.out.printf("학생들의 평균은 ? %d\n",avg);

        int sum2 = 0;

        //표준편차
        // 1단계 평균 구하기(완) 2단계 제곱한 값을 구하기, 각 값에서 평균을 빼고 2제곱 /
        // 3. 위의 값 모두 더하기/4.자료개수로 나눈다./5. 제곱근 구하기
        for(int i=0;i<STUDENT;i++){
            sum2 = (int)(Math.pow((arr[i]-avg),2));
        }
        int avg2 = sum2 / STUDENT;
        int std = (int)(Math.sqrt(avg2));
        System.out.printf("분산값은%d\n",avg2);
        System.out.printf("표준편차는 %d",std);

    }
}
