public class work1 {
    public static void main(String[] args) {
        // 65~122 사이의 랜덤한 문자를 생성하도록 한다
        // 여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자

        final int MAX = 122;
        final int MIN = 65;

        int range = MAX - MIN + 1;

        int rand = (int) (Math.random() * range + MIN);

        boolean condition1 = rand >= 65 && rand <= 90;
        boolean condition2 = rand >= 97 && rand <= 122;

        if (condition1 || condition2) {
            System.out.printf("rand : %c\n", rand);
        }
    }
}
