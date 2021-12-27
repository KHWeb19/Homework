public class HW09A {
    // 9. 1~100까지의 숫자를 순회한다.
    // 2~10사이의 랜덤한 숫자를 선택후 그 숫자의 배수를 출력
    // 다음 루프에서 다시 랜덤숫자를 선택하고 해당 숫자의 배수를 출력

    public static void main(String[] args) {
        final int MIN = 2;
        final int MAX = 10;
        final int RANGE = MAX - MIN + 1;

        int result = 0;

        boolean randomSelected = false;

        for (int i=1; i<=100; i++){
            if (!randomSelected){
                result = (int) (Math.random() * RANGE + MIN);
                randomSelected = true;
            }

            if (i % result == 0){
                System.out.printf("선택된 랜덤값: %d, 현재 출력값: %d\n", result, i);
                randomSelected = false;
            }

        }
    }
}
