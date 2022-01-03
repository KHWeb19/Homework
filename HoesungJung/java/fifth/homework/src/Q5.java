public class Q5 {
    public static void main(String[] args) {

        final int ARRMAX = 30;
        final int MAX = 100;
        final int MIN = 60;

        int range = MAX - MIN + 1;
        int[] arr = new int[ARRMAX];

        int randIdx, cnt = 1;

        int sum = 0;

        int spread = 0;

        int stdev = 0;

        for (cnt = 1; cnt <= 30; cnt++) {
            randIdx = (int) (Math.random() * ARRMAX);
            arr[randIdx] = (int) (Math.random() * range + MIN);
            System.out.printf("학생 : %d, arr[randIdx]=%d\n", randIdx, arr[randIdx]);
            spread = (int)(Math.pow(arr[randIdx]-(sum / ARRMAX),2))/ARRMAX;
            stdev = (int)Math.sqrt(spread);

            sum += arr[randIdx];
        }
        System.out.println("평균:" + sum / ARRMAX);
        //분산 = (학생 성적-평균 성적)^2/학생 수
        System.out.println("분산: " + spread);
        //표준편차 = (int)루트 분산.
        System.out.println("표준편차: "+stdev);
    }
    //마찬가지로 학생 번호가 중복되지 않게 하려면 어떻게 해야하는가?
}
