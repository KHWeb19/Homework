// 문제은행[4] - 2. 1번 문제에서 초기화한 배열을 출력해봅시다.

public class HW2 {
    public static void main(String[] args) {
        int NUM = 2;
        int START = 0;

        int[][] array = new int[NUM][NUM];
        for (int i = START; i < NUM; i++) {
            for (int j = START; j < NUM; j++) {
                array[i][j] = (int) (Math.random() * 10);
                array[i][j] = 0;
            }
        }
        for (int i = START; i < NUM; i++) {
            for (int j = START; j < NUM; j++) {
                System.out.print(array[i][j] + "");
            }
            System.out.println();
        }
    }
}



