public class problem4 {
    public static void main(String[] args) {
        final int MAX = 100;
        final int MIN = 60;
        final int ARR = 30;
        int[] arr = new int[ARR];
        int range = MAX - MIN +1;
        int sum = 0;



        for (int i = 0; i<ARR; i++){
            arr[i] = (int) (Math.random()*range + MIN);
            System.out.printf("학생 %d의 점수는 %d 입니다.\n",i, arr[i] );
            sum += arr[i];

        }
        int average = sum/ARR;
        System.out.println("학생들의 평균 점수는"+average);


    }
}
