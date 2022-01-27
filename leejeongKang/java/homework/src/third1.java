public class third1 {
    public static void main(String[] args) {
        final int max = 122, min = 65;
        final int range = (max - min + 1);

        boolean isChar = true;

        while (isChar) {
            int rand = (int) (Math.random() * range + min);

            boolean condition1 = (65 <= rand && rand <= 90);
            boolean condition2 = (97 <= rand && rand <= 122);

            if (condition1 || condition2) {
                System.out.printf("알파벳을 출력하시오 : %c\n", rand);
                isChar = false;
                break;
            }
            System.out.printf("알파벳이 아니다. : %c\n", rand);

        }
    }
}


