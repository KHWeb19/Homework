public class HW09 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int MIN = 2;
        final int MAX = 10;
        System.out.printf("9. %d~%d까지 숫자를 순회한다.\n" +
                "%d~%d사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.\n" +
                "다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.\n" +
                "그 다음 루프에서 다시 작업을 반복한다.\n" +
                "끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가?\n", START, END, MIN, MAX);
        int sum = 0;
        for (int i=START; i<=END; i++) {
            int rand = (int)(Math.random()*(MAX-MIN+1)+MIN);
            if (i % rand == 0) {
                System.out.printf("%d의 배수: %d\n", rand, i);
                sum += i;
            }
        }
        System.out.printf("총합: %d\n", sum);
    }
}
