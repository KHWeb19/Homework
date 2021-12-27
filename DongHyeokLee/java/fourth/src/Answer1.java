public class Answer1 {
    public static void main(String[] args) {

        final int MAX = 122;
        final int MIN = 65;
        int range = MAX - MIN + 1;
        boolean isChar = true;



        // 루프는 보편적으로 반복 작업하는 녀석들을 루프라고 함
        // while, for 요런애들이 루프(loop)
        while (isChar) {
            int rand = (int) (Math.random() * range + MIN);


                boolean condition1 = rand >= 65 && rand <= 90;
                boolean condition2 = rand >= 97 && rand <= 122;

                // if()는 루프가 아님
                if (condition1 || condition2) {
                    System.out.printf("rand는 영문자 대소문자중 하나임: %c(%d)\n", rand, rand);
                    isChar = false;
                    // break를 걸면 제어문 while, for 등을 바로 빠져나감
                    // break를 걸면 loop(반복)을 바로 빠져나감
                    break;//이거 없으면 왜 한번 더 출력하지??아 ㅇㅋㅇㅋ
                }

                System.out.printf("문자가 아님: %c(%d)\n", rand, rand);
            }
    }
}
