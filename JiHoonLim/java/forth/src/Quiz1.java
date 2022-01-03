public class Quiz1 {
    public static void main(String[] args) {

        /*
        1. while 안에서 랜덤문자 생성
        2. 대소문자인 경우 if문으로 들어가서 출력하고 끝
        3. 아니라면 다시 랜덤문자 생성
        4. 원하는 범위값이 나올 때까지 무한 루프
         */

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
