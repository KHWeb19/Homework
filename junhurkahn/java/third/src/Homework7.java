public class Homework7 {
    public static void main(String[] args) {
        /* 일단 1~100까지 4의 배수를 출력해야 하니 for문으로 1부터 100까지 출력
        거기서 if문으로 4의 배수를 출력 그리고 그숫자를 전부 더해줘야 하니깐
        sum변수를 만들어 주고 for문을 빠져 나가서 sum 문 출력
         */
        final int START = 1;
        final int END = 100;
        final int DECISION = 4;
        final int REMAIN = 0;

        int sum = 0;

        for (int i = START; i <= END; i++) {
            if (i % DECISION == REMAIN) {
                System.out.printf("%d의 배수 i = %d\n", DECISION, i);
                sum += i;
            }
        }

        System.out.printf("%d ~ %d까지 %d의 배수들의 합은 %d\n",
                START, END, DECISION, sum);
    }
}
