public class Homework7 {
    public static void main(String[] args) {
        final int EMPLOYE = 8;
        int[] arr = new int[EMPLOYE];
        for (int i = 1; i < EMPLOYE; i++) {
            // 3500만원도 같이 증감식으로 올라가야 하는데 for문을 배열에 집어넣어도 괜찮은가요?
            //for (int arr[i] = 3500; i < 50000; i*10)
            arr[i] = 3500 ;
            System.out.printf("직원들[%d] = %d\n", i, arr[i]);
        }
    }

}
