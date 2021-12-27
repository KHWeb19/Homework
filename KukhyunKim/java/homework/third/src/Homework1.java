public class Homework1 {
    public static void main(String[] args) {
        // 65~122 사이의 랜덤한 문자를 생성하도록 한다.
        // 여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자.

        /*
        1. 65~122 사이의 랜덤한 문자 생성
        2. 소문자or대문자가 아니면 다시 생성 -루프 1로 돌아가기
        3. 출력
         */

        final int MAX =122;
        final int MIN =65 ;

        int range = MAX -MIN + 1;
        boolean inChar = true;

        while(inChar){
            int rand = (int)(Math.random() * range + MIN);

            boolean condition1 = rand>= 65 && rand <=90;
            boolean condition2 = rand>= 97 && rand <=122;

            if(condition1||condition2) {
                System.out.printf("영문 대소문자중 하나이다. : %c(%d)\n", rand, rand);
                inChar = false;
                break;
            }
            System.out.printf("문자가 아니다. : %c(%d)\n", rand, rand);
        }
    }
}
