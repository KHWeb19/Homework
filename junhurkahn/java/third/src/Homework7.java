public class Homework7 {
    public static void main(String[] args) {
        //1~100까지 숫자중 4의 배수를 더한 결과를 출력해보자!
        for (int i = 1; i < 101; i++) {

            for (int j = 4; j < 101; j++) {
                if (j % 4 == 0) {


                    System.out.printf("%d + %d = %d\n", i, j, i + j);

                }
            }

        }
    }
}