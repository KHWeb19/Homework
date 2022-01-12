public class P07 {
    // 입사동기 각각 3,500만원 시작
    // 연봉인상률 1~10% ---- 매년 인상률이 달라진다고 가정
    // 5년후의 받을 연봉은?

    public static void main(String[] args) {
        final int INIT_PAY = 35000000;
        final int EMP_NUM = 7;
        final int END_YEAR = 5;
        final int MAX = 10;
        final int MIN = 1;
        int range = MAX - MIN + 1;
        int[] pay = new int[EMP_NUM];

        for(int i = 0; i < EMP_NUM; i++){ // 직원 반복
            pay[i] = INIT_PAY;

            for(int j = 0; j < END_YEAR; j++){ // 인상률 적용 (매년 인상률이 달라진다고 가정), 연차 반복
                float percent = (float)((int)(Math.random() * range) + MIN)/100 + 1; // 인상률 랜덤값
                pay[i] = (int)(percent * pay[i]);
            }
            System.out.printf("사원 %d의 5년후 연봉 : %d\n", i + 1, pay[i]);
        }
    }
}
