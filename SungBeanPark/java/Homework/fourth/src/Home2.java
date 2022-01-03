public class Home2 {
    public static void main(String[] args) {
        //2. 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 일명 피보나치 수열의 20번째 항을 구하도록 프로그램 해보자!
        //규칙 n번째 + n+1번째 = n+2번째항
        //n번째항이 n+1항으로, n+1항이 n+2항으로, n+2번쨰
        //first, second, third로 하고
        //third = first + second이며
        //   1      1      2      3      5     8  13  21  34  55  89
        // first  second third                           첫 번째 루프
        //        first  second third                     두 번째 루프
        //               first  second third               세 번째 루프
        // frist = second
        // second = third
        // 컴퓨터는 배열의 시작이 0이기 떄문에 0으로 기준을 맞춰주고 반복 시작을 2로 맞춰준다.(3번쨰)
        int first = 1;
        int second = 1;
        int result = 0, i;
        final int START = 2;
        final int END = 20;
        // 컴퓨터에서 배열의 시작이 0이기 때문에
        // 반복 시작을 0을 기준으로 맞춰주는 것이 좋습니다.
        // 그래서 START 2는 결국 3번째
        for (i = START; i < END; i++) {
            result = first + second;
            first = second;
            second = result;

            System.out.printf("%d번째 항 %d\n", i, result);
        }
        System.out.printf("%d번째 항 %d\n", i, result);
    }
}

