public class Homework8 {
    public static void main(String[] args) {
        // 1~100까지의 숫자를 순회한다.
        // 2~10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.

        /*
        1. 1~100까지 숫자순회 루푸 - 루프1
        * 앞선 문제들과는 다르게 Decision값이 랜덤값이므로 범위설정하고 상자만들기
        2. 2~10 랜덤값 생성
        * Decision 상자의 범위 2~10의 랜덤값
        3. 생성된값의 배수를 출력
         */

        final int Start = 1;
        final int End = 100;
        final int Remain = 0;

        final int Max = 10;
        final int Min = 2;

        int range = Max - Min + 1;
        int decision = (int) (Math.random() * range + Min);

        for (int i = Start; i <= End; i++) {
            if (i % decision == Remain) {
                System.out.printf("%d의 배수 i = %d\n", decision, i);
            }
        }
    }
}

