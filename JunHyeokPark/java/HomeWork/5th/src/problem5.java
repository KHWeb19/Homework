public class problem5 {
    public static void main(String[] args) {
        final int MAX = 100;
        final int MIN = 60;
        final int ARR = 30;
        int[] arr = new int[ARR];
        int range = MAX - MIN +1;
        int sum = 0; int dis = 0;
        int sd =0;

        for (int i = 0; i<ARR; i++){
            arr[i] = (int) (Math.random()*range + MIN);
            System.out.printf("학생 %d의 점수는 %d 입니다.\n",i, arr[i] );
            sum += arr[i];
        }
        int average = sum/ARR;
        System.out.println("학생들의 평균 점수는"+average);
        for (int i = 0; i<ARR; i++){
            dis += (arr[i]- average)*(arr[i]- average);
        }
        sd = (int)Math.sqrt(dis/ARR);
        System.out.printf("분산 값은%d 표준편차는 %d 입니다.",dis/ARR,sd);
        //분산값과 표준편차값을 실수로 표현해보려했으나 자꾸 에러가나서
        //int부여해서 정수로 표현했는데 실수로 표현은 어떻게해야되는지 궁금합니다.

    }
}


