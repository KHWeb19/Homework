public class Homework3 {
    public static void main(String[] args) {
        /*
//   1      1      1      2      3      4     6     9    13
// first second  third fourth                                  첫 번째 루프
//        first second  third fourth                           두 번째 루프
//               first second  third fourth                    세 번째 루프

    2번 문제와 같이 정수를 만드는떄 하나 더만들어줌
    result 첫번째 결과물을 첫번째 세번째 숫자랑 더해주는 것으로 함
    첫번째를 두번째로 바꿔주고 세번쨰를 두뻔째로 바꿔주고 결과물을 세번째로 바꿔주는 것을 3에서 19번까지 for문으로 반복
         */
        int first = 1;
        int second = 1;
        int third = 1;
        int result = 0, i;

        final int START = 3;
        final int END = 20;

        for (i = START; i < END; i++) {
            result = first + third;
            first = second;
            second = third;
            third = result;

            System.out.printf("%d번째 항 %d\n", i + 1, result);
        }

        System.out.printf("%d번째 항 %d\n", i, result);
    }
    }

