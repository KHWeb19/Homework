public class Practice7_1 {
    public static void main(String[] args) {
        //문제7. 회사에 직원이 7명이 있습니다. _ 12/28
        //   모두 입사동기로 3500만원으로 시작하였다고 합니다.
        //   각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        //   이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

        //1. 사원 7명9[0~6]의 초봉 = 3500 의 배열을 만들어준다.

        final int YEAR = 6;
        int[] employee = new int[YEAR];

        //2. 연봉 인상률 3500 x 1~10 / 100을 출력하는 랜덤함수를 만들어준다.

        final int MAX = 10;
        final int MIN = 1;
        int range = MAX - MIN + 1;
        int annual = 3500;
        int raise = annual * range / 100;
        int random;

        int upgrade = 0;
        int sum = 0;

        //반복문 1. 직원 7명을 순서대로 배열해준다. 2~5년간 (반복문2)를 반복시키도록 한다.

        final int MEMBER = 7; // (1~7명)

        for (int i = 1; i <= MEMBER; i++) { //7번째 직원의 5년차 배열이 나올 때 까지 반복

            //반복문 2. 1~5년 차 까지의 연봉 인상률이 나올 수 있도록 함
            // 2_1. 전원의 연봉 인상률(upgrade)을 램덤으로 구하여 기존 연봉(annual)에 더한다.
            for (int j= 1; j < YEAR; j++) {
                //올해의 연봉 인상률을 여기에서 구해준다.

                random = (int) (annual * (Math.random() * range + MIN) / 100); // 3500 x 1~10 / 100

                System.out.printf("[%d]년차 직원[%d]의 연봉 = 기존 %d만원 + 인상된 연봉 [%d] = 합계 [%d]\n"
                        , j, i, annual, random , annual + random);

                annual = annual+random;
            }
            System.out.printf("\n");


        }
        //3. 연봉 인상률을 5회 새롭게 출력하는 반복문을 만든다.
    }
}

//선생님이 의도하신 방식은 아니긴한데? 어쨌든 구함.