public class QnA5 {
    public static void main(String[] args) {
        // 65 ~ 122 까지의 난수를 무작위로 생성하고
        // 65 ~ 90 혹은 97 ~ 122 에 해당하는 숫자만 출력

        final int MAX = 122;
        final int MIN = 65;

        int range = MAX - MIN + 1;
        int rand = (int) (Math.random() * range + MIN);

        boolean condition1 = rand >= 65 && rand <= 90;
        boolean condition2 = rand >= 97 && rand <= 122;

        if (condition1 || condition2) {
            System.out.printf("rand는 영문자 대소문자중 하나임: %c\n", rand);
        }
    }
}