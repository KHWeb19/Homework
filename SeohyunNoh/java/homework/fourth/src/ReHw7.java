public class ReHw7 {
    public static void main(String[] args) {
       // 1. 직원 7명 - 고정값
       // 2. 초봉 3500만원 - 고정값
       // 3. 연봉 인상률 1~10% - 랜덤생성

        final int EMPLOYEE = 7;
        final float INIT_PAY = 3500;

        // Math.random() - 0.0 ~ 1.0미만(0.99999)
        // Math.random() * 10 + 1
        // --> 1~10.99999까지 나온다는 것
        final int MAX = 10000;
        final int MIN = 1000;
        final int END_YEAR = 5;
        final float BIAS = 1000;
        final float PERCENT = 1 / 100.f;

        int range = MAX - MIN + 1;
        float percent;

        float[] emp = new float[EMPLOYEE];

        // 7명의 직원들 각각에게 초봉3500만원을 할당한 것
        for(int i = 0 ; i < EMPLOYEE ; i++){
            emp[i] = INIT_PAY;
        }

        for(int i = 1; i < END_YEAR; i++){
            for(int j = 0; j < EMPLOYEE; j++){
                percent = (float)((int)(Math.random() * range + MIN) / BIAS) * PERCENT;

                emp[j] = emp[j] * (1 + percent);

                System.out.printf("연봉[%d] = %f, 증가율 = %f\n", j, emp[j], percent);
            }

            System.out.println();
        }

    }
}
