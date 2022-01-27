public class SequenceGenerate {
    // 8. 1 ~ 100까지 숫자를 순회한다.
    // 2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.

    final int START = 1;
    final int END = 100;

    final int RANGE_MIN = 2;
    final int RANGE_MAX = 10;

    int range = RANGE_MAX - RANGE_MIN + 1;
    int num, multiple;


    public void randomNum() {
        num = (int) (Math.random() * range + RANGE_MIN);
    }

    public void ranNumMultiple() {
        for (int i = START; i < END; i++) {
            if (i % num == 0) {

                System.out.println(i);
            }
        }
    }
}
