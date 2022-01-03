public class Q1 {
    public static void main(String[] args) {

        /*65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.
        여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자 */

        final int MAX = 122;
        final int MIN = 65;

        int range = MAX - MIN +1;
        boolean isChar = true;

        while (isChar){
            int rand = (int) (Math.random() * range + MIN);

            boolean condition1 = rand >= 65 && rand <= 90;
            boolean condition2 = rand >= 97 && rand <= 122;

            if (condition1 || condition2) {
                System.out.printf("rand 영문자 %c(%d)\n", rand, rand);
                isChar = false;
                break;
            }
            /* 65 ~ 122 사이의 랜덤 숫자가 생성되도록 만든다
           반복문을 사용하고 포함 시킬 범위를 설정 한다
           91 ~ 96 사이의 숫자는 아스키 코드로 대, 소 문자가 아니므로 제외 시킨다
           65 ~ 90, 97 ~ 122 의 숫자가 나오도록 설정한다
           아닐경우 계속 돌리고 맞을경우 브레이크를 걸어 멈춘다 */
            }
        }
    }

