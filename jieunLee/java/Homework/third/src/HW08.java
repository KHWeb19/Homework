public class HW08 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int MIN = 2;
        final int MAX = 10;
        System.out.printf("%d~%d까지 숫자를 순회한다.\n%d~%d사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.\n", START, END, MIN, MAX);
        int rand = (int)(Math.random()*(MAX-MIN+1)+MIN);
        for (int i=START; i<=END; i++) {
            if (i % rand == 0) {
                System.out.println(i);
            }
        }
    }
}
