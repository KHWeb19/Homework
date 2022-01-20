public class Q3 {
    public static void main(String[] args) {

        int first = 1;
        int second = 1;
        int third = 1;
        int result = 0, i;

        final int START = 3;
        final int END = 20;


        for (i = START; i < END; i++) {
            result = first + third;
            first = second;
            second = third;
            third = result;


            System.out.printf("%d번째 항 %d\n", i + 1, result);
        }


        //   1      1      1      2      3      4     6     9    13
        // first second  third fourth                                  첫 번째 루프
        //        first second  third fourth                           두 번째 루프
        //               first second  third fourth                    세 번째 루프

        System.out.printf("%d번째 항 %d\n", i, result);
    }
}
