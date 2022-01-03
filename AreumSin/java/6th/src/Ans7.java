public class Ans7 {
    public static void main(String[] args) {

        // 구현 전략
        // 1. 고정값 7명 - 직원
        // 2. 초봉 - 3500만원 고정
        // 3. 연봉 인상률 - 1 ~ 10% 랜덤값
        // 4. 5년후 받을 값을 시뮬레이션하기

        final int EMP_NUM = 7;
        final float INIT_PAY = 100;
        final int MAX = 10;
        final int MIN = 1;
        final int END_YEAR = 5;
        final float PERCENT = 1 / 100.f;

        int range = MAX - MIN + 1;
        float percent;

        float[] emp1 = new float[EMP_NUM];
        float[] emp = new float[7];

        for (int i = 0; i < EMP_NUM; i++) { // 7번 반복할거야.
            emp[i] = INIT_PAY; // 7명에게 초봉 3500을 넣어줄거.
        }

        for (int i = 1; i < END_YEAR; i++) {// 5번 반복 -> 5년 동안 확인
            for (int j = 0; j < EMP_NUM; j++) {// 7명의 사람들의 인상률 조사후 더해줄거.
                percent = (float) (Math.random() * range + MIN) * PERCENT; // 인상률 폭 랜덤.
                // 1%의 인상률이라면
                // 최종 연봉 = 현재 연봉 + 현재 연봉 * 인상률
                //          = 현재 연봉 * (1 + 인상률)
                // emp[j] = emp[j] * (1 + percent);
                emp[j] += (emp[j] * percent); // emp[j] = emp[j] + emp[j] * percent
                //
                System.out.printf("연봉[%d] = %f, 증가율 = %f\n", j, emp[j], percent);
            }

            System.out.println();
        }
    }
}
