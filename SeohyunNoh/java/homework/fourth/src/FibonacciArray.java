public class FibonacciArray {
    public static void main(String[] args) {
        //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        // 일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!

        final int MAX = 100;
        final int START = 2;
        final int END = 20;

        int[] arr = new int[MAX];

        arr[0] = 1;
        arr[1] = 1;

        for(int i = START ; i < END; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.printf("arr[%d] = %d\n", i , arr[i]);
        }


    }
}
