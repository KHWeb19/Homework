public class HW09 {
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int MIN = 2;
        final int MAX = 10;
        final int REMAIN = 0;
        System.out.printf("9. %d~%d까지 숫자를 순회한다.\n" +
                "%d~%d사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.\n" +
                "다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.\n" +
                "그 다음 루프에서 다시 작업을 반복한다.\n" +
                "끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가?\n", START, END, MIN, MAX);
        //1. 반복문 생성
        //2. 난수 생성
        //   난수의 배수가 나올 때까지 새로운 난수를 생성하면 안됨
        //   난수가 i로 나누어 떨어지면 출력하고 sum에 더함
        boolean isRandAllocCheck = false;
        int rand = 0;
        int sum = 0;
        for (int i=START; i<=END; i++) {
            while (!isRandAllocCheck) {
                rand = (int)(Math.random()*(MAX-MIN+1)+MIN);
                isRandAllocCheck = true;
            }
            if (i % rand == REMAIN) {
                System.out.printf("%d의 배수: %d\n", rand, i);
                isRandAllocCheck = false;
                sum += i;
            }
        }
        System.out.printf("총합: %d\n", sum);
    }
}
