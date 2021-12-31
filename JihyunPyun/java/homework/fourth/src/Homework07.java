
public class Homework07 {
    public static void main(String[] args) {
//        회사에 직원이 7명이 있습니다.
//        모두 입사동기로 3500만원으로 시작하였다고 합니다.
//        각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
//        이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

//        HOW TO..
//        1. 직원 연봉 배열 생성
//        2. 연봉 인상률 랜덤값 생성
//        3. 인상값 배열에 넣기 (5년 후니까 2~3번을 5번 돌리기)
//        4. 최종 연봉 출력

        final int MAX = 10, MIN = 1;
        final int EMPLOYEE = 7;
        final float BIAS = 1000;
        final float PERCENT = 1 / 100.f;

        int range = MAX - MIN + 1;
        int year = 0;


        float[] employee = new float[7];

        for (int i = 0; i < EMPLOYEE; i++){
            employee[i] = 3500;
        }

        while (year < 6){ //5년 후니까 5번 반복
            for (int i = 0; i < EMPLOYEE; i++){
                float percent = (float)((int)(Math.random() * range + MIN) / BIAS) * PERCENT;
                employee[i] += (employee[i] * percent);
            }
            year++;
        }

        for (int i = 0; i < EMPLOYEE; i++){
            System.out.printf("%d번 직원 연봉 : %f만원\n", i+1, employee[i]);
        }

    }
}
