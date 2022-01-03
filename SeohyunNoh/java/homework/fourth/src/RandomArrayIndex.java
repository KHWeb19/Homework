public class RandomArrayIndex {
    public static void main(String[] args) {
        // 임의의 랜덤 배열 인덱스 제어하기
        // 작동원리 자체를 이해를 못하겠다
        // 임의의 배열 인덱스를 선택하도록 지원하는 것이 무슨 의미지?

        final int ARRMAX = 100;
        final int MAX = 100;
        final int MIN = 50;

        int range = MAX - MIN + 1;
        int[] arr = new int[ARRMAX];

        int randIdx, cnt = 1;

        for( ; cnt <= 10; cnt++){
            // 임의의 배열 인덱스를 선택하도록 지원 >> 이해 못하겠다
            randIdx = (int)(Math.random() * ARRMAX);
            // 아래에서 50~100까지의 랜덤값이 뽑힌다는 뜻인데
            arr[randIdx] = (int)(Math.random() * range + MIN);
            System.out.printf("randIdx : %d, arr[randIdx] = %d\n", randIdx, arr[randIdx]);
        }


    }
}
