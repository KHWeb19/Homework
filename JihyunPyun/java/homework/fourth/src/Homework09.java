public class Homework09 {
    public static void main(String[] args) {
//        1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
//        0  1  2  3  4  5  6  7   8   9  10
//        이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자! (배열)

        final int MAX = 25;
        int result = 0;

        int[] arr = new int[MAX];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;

        for (int i = 4; i < MAX; i++){
            arr[i] = arr[i-4] + arr[i-3] + arr[i-2];
        }
        System.out.printf("25번째 항 : %d", arr[24]);

    }
}

