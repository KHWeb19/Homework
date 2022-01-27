public class P9 {
    /*
     1. 1 ~ 100 순회,
     2. 2 ~ 10 랜덤 숫자 선택
     3. 이 숫자의 배수 출력
     4. 루프에서 작업반복 ---- 반복문 안에서 랜덤문 찾아야함
     5. 출력된 숫자들의 합
     */

    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN + 1;
        int sum = 0;
        int rand = 0;
        boolean isCheck = false;

        for (int i = START; i <= END; i++){ // 1. 1 ~ 100 순회
            while (!isCheck) { // ----- 랜덤값 고정
                rand = (int)(Math.random() * range) + MIN; // 2. 랜덤 숫자 선택
                isCheck = true;
            }
            if (i % rand == REMAIN) { // 3. 배수 출력
                sum += i + rand; // 5. 출력된 숫자들의 합
                System.out.printf("%d의 배수 : %d\n", rand, i);
                isCheck = false;
            }
        }
        System.out.printf("\n출력된 숫자들의 합 : %d", sum);
    }
}
