public class Homework6 {
    public static void main(String[] args) {
        //45678911234 가 숫자가 11개이니 배열을 11개를 넣자
        final int MIN = 12;
        final int MAX = 12;
        int[] arr = new int[MAX];
        int[] arr2 = new int[MIN];
        for (int i = 0; i < MAX; i++) {
            /*정해진 규칙이 없으니 이것을  arr[0] = 4, arr[1] = 3, arr[2] = 2, arr[3] = 1
            나타내는 법을 모르겠습니다*/
            arr[i] = i + 1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
