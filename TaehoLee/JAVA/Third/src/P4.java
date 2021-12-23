public class P4 {
    // 구구단 7단 출력

    public static void main(String[] args) {

        final int NUM = 7;
        int count;

        for(count = 1; count <= 9; count++){

            System.out.printf("%d * %d = %d\n",NUM, count, NUM * count);
        }

    }
}
