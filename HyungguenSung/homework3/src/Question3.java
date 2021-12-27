public class Question3 {
    public static void main(String[] args) {
        int first = 1;
        int second = 1;
        int third = 1;
        int result = 0, i;

        final int START = 3;
        final int END = 25;

        for (i = START; i < END; i++){
            result = first + third;
            first = second;
            second = third;
            third = result;

            System.out.printf("%d번째 항 %d\n", i + 1, result);
        }


    }
}
