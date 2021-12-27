public class reviewwork1 {
    public static void main(String[] args) {
        final int MAX = 122;
        final int MIN = 65;

        int range = MAX - MIN + 1;
        boolean isChar = true;

        // 루프는 보편적으로 반복 작업하는 녀석등을 루프라고 함
        // while, for 요런 애들이 루프(loop)

        while (isChar) {
            int rand = (int) (Math.random() * range + MIN);

            // 65~122 사이의 랜덤한 문자를 생성하도록 한다.
            // 여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자

            boolean condition1 = rand >= 65 && rand <= 90;
            boolean condition2 = rand >= 97 && rand <= 122;

            // if()는 루프가 아님
            if (condition1 || condition2) {
                System.out.printf("rand는 영문자 대소문자중 하나임 : %c(%d)\n", rand, rand);
                isChar = false;
                // break를 걸면 loop(반복)을 바로 빠져나감
                break;
            }
            System.out.printf("문자가 아님 : %c(%d)\n", rand, rand);
        }
    }
}
/* third homework 중 루프라는 개념에 대해 알지 못해 루프를 설정하지못함.
루프라는 개념과 영문자로 출력할 시 영문자가 아닌 경우에 다시 돌려서 영문자가
나오게 만드는 방법에 대해 복습함.
 */