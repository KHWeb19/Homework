public class Quiz4 {
    public static void main(String[] args) {
        /*
        1. 반학생 30명 -> 배열 최대값 30
        2. 60점 미만 없음 -> 랜덤값 60이상
        3. 임의로 배치 -> 랜덤 배치
        4. 평균값
         */

        final int STU = 30;
        final int MAX = 100;
        final int MIN = 60;

        int range = MAX - MIN +1;
        int sum = 0;
        int[] arr = new int[STU];

        int SCO;

        // 랜덤값 생성 작업 및 평균을 구하기 위한 합산
        for (int i = 0; i < STU; i++){
            SCO = (int)(Math.random() * range + MIN);
            arr[i] = SCO;
            System.out.printf("arr[%d] = %d\n" , i,arr[i]);
            sum += SCO;
        }
        //평균
        System.out.println("반 평균은 " + (float)(sum) /STU);
    }
}
