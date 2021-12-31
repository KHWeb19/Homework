public class Homework7 {
       public static void main(String[] args) {
        /*  회사에 직원이 7명이 있습니다.
            모두 입사동기로 3500만원으로 시작하였다고 합니다.
            각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
            이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다. */
              // 1 만들어야 할정수가 2개 7명 3500만원
              // 2 float 실수를  만들어 줘야 될것같다 연봉인상 그리고 계속 올라야 하니 for문 배열 사용
              // 3 그리고 인상률이 랜덤이기 때문에 Math.random 사용


              // 구현 전략
              // 1. 고정값 7명 - 직원
              // 2. 초봉 - 3500만원 고정
              // 3. 연봉 인상률 - 1 ~ 10% 랜덤값
              // 4. 5년후 받을 값을 시뮬레이션하기

              // int 직원수 7명 연봉 3500정수 지정
              final int NUM = 7;
              final float PAY = 3500;

              // Math.random() - 0.0 ~ 1.0 미만 (0.99999)
              // rand * range - 0.0 ~ range 미만
              // (Math.random() * range + MIN)
              // MIN ~ (range - 1).xxxx 까지 나온다는 의미
              // Math.random() * 10 + 1 ---> 1 ~ 10.999999
              // 소수점 셋 째까지 활용한다 가정하고
              // Math.random() - 1000 ~ 10000 ---> 양변에 1000을 나누면 1 ~ 10

              // 정수 5년 지정 MAX MIN BIAS PERCRNT 연봉 증가율 지정
              final int MAX = 10000;
              final int MIN = 1000;
              final int YEAR = 5;
              final float BIAS = 1000;
              final float PERCENT = 1 / 100.f;

              // 연봉 증가율 난수지정
              int range = MAX - MIN + 1;
              float percent;

              // 직원수 배열 집어넣기
              float[] emp = new float[NUM];

              // 반복문 PAY 7번나오도록 지정
             for (int i = 0; i < NUM; i++) {
                     emp[i] = PAY;
              }

             // 이중 For문으로 4번 연봉과 증가율이 나오게하고 증가율하고 곱해준 연봉이 7번 나오도록함
              for (int i = 1; i < YEAR; i++) {
                     for (int j = 0; j < NUM; j++) {
                            // (int) (Math.random() * range + MIN) - 1000 ~ 10000: A
                            // A / BIAS = 1 ~ 10: B
                            // B * PERCENT = 0.01 ~ 0.1
                            emp[i] = PAY;
                            // 연봉과 곱해줄 percent지정
                            percent = (float) ((int) (Math.random() * range + MIN) / BIAS) * PERCENT;
                            // 1%의 인상률이라면
                            // 최종 연봉 = 현재 연봉 + 현재 연봉 * 인상률
                            //          = 현재 연봉 * (1 + 인상률)
                            // emp[j] = emp[j] * (1 + percent);
                            // 연봉에서 * percent 7번반복
                            emp[j] += (emp[j] * percent); // emp[j] = emp[j] + emp[j] * percent

                            // 출력 연봉과 증가율
                            System.out.printf("연봉[%d] = %f, 증가율 = %f\n", j, emp[j], percent);
                     }

                     System.out.println();
              }
       }
}