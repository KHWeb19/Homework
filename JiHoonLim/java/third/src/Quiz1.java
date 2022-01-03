public class Quiz1 {
    public static void main(String[] args) {
        boolean isRight = false;

        while (!isRight) {
            int rand = (int) (Math.random() * 58 + 65);
            boolean condition1 = rand <= 90 || rand >= 97;

            if (condition1) {
                System.out.printf("생성한 문자는 %c\n", rand);
                isRight = true;

            } else {
                System.out.printf("생성한 문자는 %c\n", rand);
                System.out.println("재생성합니다.");
            }
        }
    }
}
