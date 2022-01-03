public class Q3 {
    public static void main(String[] args) {


        //1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        //이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!

        // 기본 버전

        int first = 1; int second = 1; int third = 1; int result = 0, i;
        final int start = 3; final int end = 25;

        // * final
        // 초기값이 저장되면 최종적인 값이 되어 프로그램 실행 도중에 수정을 할 수 없다.
        // 초기값을 줄 수 있는 방법은 딱 두가지가 있다.
        // 첫번째는 [필드 선언시에 주는 방법]이 있고, 두번째는 [생성자를 통해서 주는 방법]이 있습니다.

        for (i = start; i < end; i++) {
            result = first + third;
            first = second;
            second = third;
            third = result;

            // * for (초기값; 조건식; 초기값변경(증감식))
            // 제일 먼저 '초기값'이 수행되고, 그 이후부터는 조건식이 참인 동안
            // 조건식 -> 수행될 문장 -> 증감식 의 순서로 계속 반복된다.
            // 조건식이 거짓이 되면 for문 전체를 빠져나가게 된다.

            // * 초기화
            // 반복문에 사용될 변수를 초기화하는 부분, 처음에 한번만 실행된다.
            // 보통 변수 하나로 for문을 제어하지만, 둘 이상의 변수가 필요할 때는 ','를 구분자로 변수를 초기화 한다.
            // 두 변수의 타입은 같아야한다.

            // * 조건식
            // 값이 참이면 반복, 거짓이면 중단 후 for문을 벗어난다.
            // i < end 인 동안 for문안의 문장을 반복.

            // * 증감식
            // 반복문을 제어하는 변수의 값을 증가 or 감소시키는 식이다.
            // for (i = start; i < end; i++) -> start부터 end까지 1씩 증가한다.

            // * 참고
            //   1      1      1      2      3      4     6     9    13
            // first second  third fourth                                  첫 번째 루프
            //        first second  third fourth                           두 번째 루프
            //               first second  third fourth                    세 번째 루프


            System.out.printf("%d번째 항 %d\n", i + 1, result);

        }

        // * 다른 버전

        //int first = 1; int second = 1; int third = 1; int fourth = 2; int result = 0, i;
        //final int start = 4; final int end =25;

        //for (i = start; i < end; i++) {
            //result = first + second + third;
            //first = second;
            //second = third;
            //third = fourth;
            //fourth = result;

            //System.out.printf("%d번째 항 %d\n", i + 1, result);


    }
}
