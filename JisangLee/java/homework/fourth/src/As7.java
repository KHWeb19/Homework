public class As7 {
    //1 ~ 100까지의 숫자 중 4의 배수를 더한 결과를 출력
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int MULTIPLE = 4; //배수를 선택
        final int REMAIN = 0;
        int sum = 0; //초기값이 떠 있기 때문에 0으로 설정

        System.out.printf("%d ~ %d까지의 숫자 중 %d의 배수를 더한 결과를 출력\n", START, END, MULTIPLE);


        for (int i = START; i <= END; i++) {
            if (i % MULTIPLE == REMAIN) {
                sum += i;

                if (i == END) {

                    System.out.println("             " + sum);

                }
            }
        }
    }
}
