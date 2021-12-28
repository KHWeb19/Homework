public class Quiz5 {
    public static void main(String[] args) {

        /*
        1. 분산 - 편차의 제곱 총합 / 변량의 개수
        2. 표준편차 - 루트 분산
        3. 두번째 for문에서 평균값을 가지고 분산 및 표준편차 계산
         */

        final int STU = 30;
        final int MAX = 100;
        final int MIN = 60;

        int range = MAX - MIN +1;
        double sum = 0;
        int[] scoarr = new int[STU];

        int SCO;
        double var =0, stadev=0;


        for (int i = 0; i < STU; i++){
            SCO = (int)(Math.random() * range + MIN);
            scoarr[i] = SCO;
            System.out.printf("arr[%d] = %d\n" , i, scoarr[i]);
            sum += SCO;
        }
        double avg = sum/STU;
        System.out.println("반 평균은 " +avg);

        for (int j = 0; j < STU; j++){
            var += Math.pow(scoarr[j] - avg,2);
            stadev = Math.sqrt(var);
        }
            System.out.printf("분산은 %f 표준편차는 %f\n",var/STU,stadev/STU);
    }
}
