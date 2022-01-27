public class As9 {
    //1 ~ 100까지의 숫자를 순회
    //2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력
    //다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력
    //그 다음 루프에서 다시 작업을 반복
    //끝까지 순회 했을 때의 출력된 숫자들의 합?
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;

        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;
        int range = MAX - MIN + 1;
        int sum = 0;

        for (int i = START; i <= END; i++) {
            //한 번 배수를 구할 때마다 랜덤 값이 다시 생성되어야 하므로 랜덤 함수를 for 문 안에 배치
            int rand = (int) (Math.random() * range + MIN);
            if (i % rand == REMAIN) {
                System.out.printf(" 2 ~ 10 사이의 랜덤한 숫자 %d의 배수: %d\n  ", rand, i);
                sum += i;
                }
        }
        System.out.println("끝까지 순회 했을 때의 출력된 숫자들의 합: " + sum);
    }
}
