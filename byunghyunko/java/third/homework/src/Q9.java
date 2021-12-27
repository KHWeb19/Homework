public class Q9 {
    public static void main(String[] args) {
        //9. 9. 1~100까지의 숫자를 순회한다.
        //2~10사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        //다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        //그 다음 루프에서 다시 작업을 반복한다.
        //끝까지 순회했을때 출력된 숫자들의 합은 얼마인가

        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;

        boolean isRandomAllocCheck = false;
        int decision = 0;

        for (int i = START; i <= END; i++) {
            while (!isRandomAllocCheck) {
                decision = (int) (Math.random() * range + MIN);
                isRandomAllocCheck = true;
            }

            if (i % decision == REMAIN) {
                System.out.printf("%d의 배수 i = %d\n", decision, i);
                isRandomAllocCheck = false;
            }
        }
    }
}
