public class Answer01 {
    /*
    - 문제1. 65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.
          여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자

    - 구현 전략
    문자와 숫자가 대응되는 ASCII 코드 이용
    반복문 while 안에서 난수를 발생시키기
    난수 발생 범위 : 65 ~ 122 사이 -> (int)(Math.random() * (122-65 +1) + 65))
    while의 종료 조건: 소문자나 대문자에 해당하는 난수가 발생 ( 소문자조건 or 대문자조건)
    [소문자 조건 : 97<= 난수 <=122]
    [대문자 조건 : 65<= 난수 <= 90]
    난수가 발생한 뒤 조건을 판별하기 위해 if문 사용-> 발생된 난수에 해당하는 문자가 [소문자 OR 대문자] [문자가 아닌지] 판별
     */

    public static void main(String[] args) {
        final int MAX = 122;
        final int MIN = 65;

        int range = MAX - MIN + 1;
        boolean isChar = true;

        // 루프는 보편적으로 반복 작업하는 녀석들을 루프라고 함
        // ex) while, for
        while (isChar) {
            int rand = (int) (Math.random() * range + MIN);

            boolean condition1 = rand >= 65 && rand <= 90;  //대문자조건
            boolean condition2 = rand >= 97 && rand <= 122; //소문자조건

            if (condition1 || condition2) {
                if(condition1) {
                    System.out.printf("rand는 영문자 대문자중 하나임: %c(%d)\n", rand, rand);
                    isChar = false;
                    // break를 걸면 loop(반복)을 바로 빠져나감
                    break;
                }
                if(condition2) {
                    System.out.printf("rand는 영문자 소문자중 하나임: %c(%d)\n", rand, rand);
                    isChar = false;
                    break;
                }
            }

            System.out.printf("문자가 아님: %c(%d)\n", rand, rand);
        }
    }
}