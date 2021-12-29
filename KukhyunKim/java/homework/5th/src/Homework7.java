public class Homework7 {
    public static void main(String[] args) {
        /*
        7. 회사에 직원이 7명이 있습니다.
           모두 입사동기로 3500만원으로 시작하였다고 합니다.
           각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
           이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.
         */

        /*
        1. 7개의 인덱스설정 회사원 1~7
        2. 엘맅먼트를 모두 3500에시작
        3. 1회 반복문 시전시마다 이전값 +(이전값 * 1 ~ 10%의 랜덤값) 시켜 할당
        4. 4번의 반복문 시행후 각 인덱스들의 연봉값 출력
         */
        final int EMP_NUM = 7;
        final float INIT_PAY = 3500;
        final int MAX = 10000;
        // 10 으로 설정시 0.xxxx의 숫자가 살아있어서 1000을 곱한값으로 범위 지정한후
        // 나중에 1000을 나눠서 소숫점 날리기
        final int MIN = 1000;
        final int END_YEAR = 5;
        final float BIAS = 1000;
        // 소숫점 날리기위해서 상자 준비
        final float PERCENT = 1 / 100.f;

        /*
        int 범위 = -2,147,483,648 ~ 2,147,438,647
        float의 범위 = 3.4E-38(-3.4*10^38) ~ 3.4E+38(3.4*10^38)
        둘이 데이터 용량 차이는 없음 하지만 float은 정교하게 표현가능
         */

        int range = MAX - MIN + 1;
        float percent;
        // 결과값(오른 연봉값)을 보기위한 퍼센트 박스 생성

        float[] emp = new float[EMP_NUM];
        // 사원들 넣을 박스 생성

        for (int i = 0; i < EMP_NUM; i++) {
            emp[i] = INIT_PAY;
        }
        // 사원들의 박스에 3500씩 전부 지정 0~6까지

        for (int i = 1; i < END_YEAR; i++) {
            for (int j = 0; j < EMP_NUM; j++) {
                percent = (int) ((Math.random() * range + MIN) / BIAS)* PERCENT;
                emp[j] += (emp[j] * percent);
                System.out.printf("연봉[%d] = %f, 증가율 = %f\n", j, emp[j], percent);
            }
            // 연봉증가량 = {(랜덤 * 10000~1000)/1000 } * 1 / 100%
            // 연봉 = 연봉+ (연봉 * 연봉증가량)
            // 출력

        }
        // 끝나는 연도까지 내부 for문을 돌리시오
    }
}