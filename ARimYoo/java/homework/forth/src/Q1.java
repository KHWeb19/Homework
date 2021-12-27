public class Q1 {
    public static void main(String[] args) {

        // 65 ~ 122 사이의 랜덤한 문자를 생성.
        // 소문자나 대문자가 아니라면 다시 생성

        final int MIN = 65;
        final int MAX = 122;
        int range = MAX - MIN + 1;

        int rand = (int)(Math.random() * range + MIN);

        //랜덤값이 소문자나 대문자라면 랜덤값을 출력한다.
        if (rand >= 65 && rand <= 90 || rand >= 97 && rand <= 122) {

            System.out.printf("rand = %c\n", rand);

        } else {

            // 그렇지 않으면 랜덤값을 다시 구해라
            while (rand > 90 && rand < 97) {

                rand = (int) (Math.random() * range + MIN);

            }

            // 다시 rand >= 65 && rand <= 90 || rand >= 97 && rand <= 122 값이 나오면 출력하라.
            System.out.printf("rand = %c\n", rand);

        }

        // Q. 제가 작성한 코드처럼 while을 if문 밖에 쓰지 않고 else 부분에만 작성해도 같은 결과의 값이 나오나요?
    }
}
