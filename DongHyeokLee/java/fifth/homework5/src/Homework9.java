public class Homework9 {
    public static void main(String[] args) {
        //1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        //이와 같은 숫자의 규칙을 찾아 25번째 항을 구하자 -> 배열화

        final int MAX = 100;
        final int START = 3;
        final int END = 25;

        int[] arr = new int[MAX];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;

        for (int i = START; i < END; i++) {
            arr[i] = arr[i - 1] + arr[i - 3];
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }

}
