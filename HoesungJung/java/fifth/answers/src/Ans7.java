public class Ans7 {public static void main(String[] args) {
    ////불변의 회사 직원 7명
    final int EMP_NUM = 7;
    ////int는 숫자가 너무 커지니까 소수점 아래 6자리까지 나오는 float형으로 만듦.
    final float INIT_PAY = 3500;

    // Math.random() - 0.0 ~ 1.0 미만 (0.99999)
    // rand * range - 0.0 ~ range 미만
    // (Math.random() * range + MIN)
    // MIN ~ (range - 1).xxxx 까지 나온다는 의미
    // Math.random() * 10 + 1 ---> 1 ~ 10.999999
    // 소수점 셋 째까지 활용한다 가정하고
    // Math.random() - 1000 ~ 10000 ---> 양변에 1000을 나누면 1 ~ 10

    ////float 소수를 쓰기 때문에 10퍼센트를 10000으로 표현
    final int MAX = 10000;
    ////역시 같은 이유로 1퍼센트를 1000으로 표현
    final int MIN = 1000;
    ////이들의 인상률 비교는 5년차까지. (마지막 인상은 4년 후)
    final int END_YEAR = 5;

    ////이 두가지는 퍼센티지를 만들기위한 거라는 걸 알겠는데 숫자의 의미는 모르겠습니다.
    final float BIAS = 1000;
    final float PERCENT = 1 / 100.f;

    ////인상률의 범위 설정
    int range = MAX - MIN + 1;
    ////실수 percent 생성
    float percent;
    ////직원수를 emp라는 배열로 만듦
    float[] emp = new float[EMP_NUM];
    ////임의의 정수 i를 0으로 초기화
    ////i는 직원수(7)보다 작아야 하고,- 컴퓨터 기준 첫번째는 0이기 때문
    ////한 번 출력 후 1씩 증가함.
    for (int i = 0; i < EMP_NUM; i++) {
        ////직원 7명의 초봉을 뿌려줌.
        emp[i] = INIT_PAY;
    }
    ////임의의 정수 i를 0으로 초기화
    ////i는 5년보다 작아야 하고,
    ////한 번 출력 후 1씩 증가함.
    for (int i = 1; i < END_YEAR; i++) {
        ////확실한 개인별 변화를 보기 위해 중첩 for문을 만들어줌.
        for (int j = 0; j < EMP_NUM; j++) {

            // (int) (Math.random() * range + MIN) - 1000 ~ 10000: A
            // A / BIAS = 1 ~ 10: B
            // B * PERCENT = 0.01 ~ 0.1

            ////1~10 퍼센트의 인상률을 랜덤으로 정함.
            percent = (float) ((int) (Math.random() * range + MIN) / BIAS) * PERCENT;

            // 1%의 인상률이라면
            // 최종 연봉 = 현재 연봉 + 현재 연봉 * 인상률
            //          = 현재 연봉 * (1 + 인상률)
            // emp[j] = emp[j] * (1 + percent);

            ////초봉에 랜덤 인상률 만큼을 더함.
            emp[j] += (emp[j] * percent); // emp[j] = emp[j] + emp[j] * percent

            System.out.printf("연봉[%d] = %f, 증가율 = %f\n", j, emp[j], percent);
        }

        System.out.println();
    }
}
}
