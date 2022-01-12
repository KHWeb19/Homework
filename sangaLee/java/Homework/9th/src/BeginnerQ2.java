import java.util.Arrays;

public class BeginnerQ2 {
    public static void main(String[] args) {

        // Q2. 1번 문제에서 초기화한 배열을 출력해봅시다.

        int[][] array = new int[2][2]; // 정수를 4개씩 담을 수 있는 배열이 2개 생성된다.

        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;

        for (int i=0; i< array.length; i++) {
            /*for (int j=0; j< array[i].length; j++){
                System.out.print(array[i][j]+ " ");
            }*/
            System.out.println(Arrays.toString(array[i]));
        }

    }
}
