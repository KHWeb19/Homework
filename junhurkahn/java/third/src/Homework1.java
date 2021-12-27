public class Homework1 {
    public static void main(String[] args) {
        /* 65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.
         여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자*/
        /* 일단  65에서 122 까지 랜덤문자를 생성해야하니 Math.random을 사용하자
        그리고 whil문을 사용하여 65~90사이의 수 97~122사이의수를 출력하자
        그리고 if문을 이용하여 두개의 조건중 하나만 충족이 되면 영문자 대소문이 출력되도록 하자
        아니면 문자가 아님으로 빠져 나가게 하자 그럼 else문을 써서 빠져나가게 해애하는 것인가?
         */
        final int MAX = 122;
        final int MIN = 65;

        int range = MAX - MIN + 1;

        while (true) {
            int rand = (int) (Math.random() * range + MIN);

            boolean condition1 = rand >= 65 && rand <= 90;
            boolean condition2 = rand >= 97 && rand <= 122;


            if (condition1 || condition2) {
                System.out.printf("rand는 영문자 대소문자중 하나임: %c(%d)\n", rand, rand);

                break;
            }

            System.out.printf("문자가 아님: %c(%d)\n", rand, rand);
        }
    }
}