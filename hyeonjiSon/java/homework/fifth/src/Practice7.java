public class Practice7 {
    public static void main(String[] args) {
        //문제7. 회사에 직원이 7명이 있습니다. _ 12/28
        //   모두 입사동기로 3500만원으로 시작하였다고 합니다.
        //   각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        //   이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

        //1. 사원 7명9[0~6]의 초봉 = 3500 의 배열을 만들어준다.

        final int EMP = 7;
        int[] employee = new int[EMP];

        //2. 연봉 인상률 3500 x 1~10 / 100을 출력하는 랜덤함수를 만들어준다.

        final int MAX = 10;
        final int MIN = 1;
        int range = MAX - MIN + 1;
        int annual = 3500;
        int raise = annual * range / 100;
        int random;

        int upgrade = 0;
        int sum = 0;

        for (int j = 1; j < EMP; j++ ) {
            System.out.printf("[1]년차 직원[%d]의 연봉 = %d만원 + 인상된 연봉 [%d] = 합계 [%d]\n"
                    , j, annual, upgrade, sum);
            //여기까지 1년차의 연봉 전원 3500만원으로 나옴
        }System.out.printf("\n");
//------------------------------------------------------------------------------------------------------

        //반복문 1. 2~5년간 (반복문2)를 반복시키도록 한다.

        final int YEAR = 5; // (0~5년)

        for (int i = 2; i < YEAR; i++) { //2~5년 간 반복하는 반복문 1

            //반복문 2. 7명의 직원을 배열.
            // 2_1. 전원의 연봉 인상률(upgrade)을 램덤으로 구하여 기존 연봉(annual)에 더한다.
            for (int k = 1; k < EMP; k++) {//3. 연봉 인상률을 5회 새롭게 출력하는 반복문을 만든다.
                //올해의 연봉 인상률을 여기에서 구해준다.
                random = (int) (annual * (Math.random() * range + MIN) / 100); // 3500 x 1~10 / 100

                System.out.printf("[%d]년차 직원[%d]의 연봉 = 기존 %d만원 + 인상된 연봉 [%d] = 합계 [%d]\n"
                        , i, k, annual, random , annual + random);

                annual = annual+random;
            }
            System.out.printf("\n");
        }

    }
    }

    //문제 발생. 직원 1 결과 + 직원 2 결과 + 직원 3 결과 식으로 누적됨...
    //그럼... 직원 7명 반복문 안에 1~5년차 반복문으로 돌리는 게 낫지 않나??? 7_1로 옮겨서 다시 풀어보자.