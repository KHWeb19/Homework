public class P07 {
    // 입사동기 각각 3,500만원 시작
    // 연봉인상률 1~10% ---- 매년 인상률이 달라진다고 가정
    // 5년후의 받을 연봉은?

    public static void main(String[] args) {
        final int START = 35000000;
        final int NUM = 7;
        final int END = 5;
        final int MAX = 10;
        final int MIN = 1;
        int range = MAX - MIN + 1;
        int[] arr = new int[NUM];

        for(int i = 0; i < NUM; i++){ // 초기값 입력
            arr[i] = START;
        }

        for(int n = 0; n < END; n++){ // 년차 반복
            for(int i = 0; i < NUM; i++){ // 인상률 적용 (매년 인상률이 달라진다고 가정)
                float rand = ((float)Math.random() * range + MIN)/100 + 1; // 인상률 랜덤값
                arr[i] = (int)(rand * arr[i]);
            }
        }
        System.out.printf("사원 각각의 5년후 받을 연봉은 : %d원, %d원, %d원, %d원, %d원, %d원, %d원", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5],arr[6]);


    }
}
