public class Homework_07 {
    public static void main(String[] args) {
        //7. 회사에 직원이 7명이 있습니다.
        //   모두 입사동기로 3500만원으로 시작하였다고 합니다.
        //   각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        //   이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

        final int MONEY = 35000000;
        //final int MONEY = 1000000; // 처음에는 쉽게 100만원으로 시작.
        final int YEAR = 5;

        // 인상률이 다 다르므로 랜덤으로 뽑아 보자.
        final int MAX = 10;
        final int MIN = 1;
        final int RANGE = MAX - MIN +1;

        double result;

        // 매년 연봉을 인상하기 때문에 for을 이용한다.
        for (int i = 0; i <= YEAR; i++) {
            int rand = (int) (Math.random() * RANGE + MIN); // 1~ 10에서 랜덤으로 나온다.

            double sum = 1+ rand*0.01;
            result = MONEY *sum;
            System.out.printf("%d 비율로 상승하여 연봉은 %.0f 입니다.\n",rand,result);
        }

    }
}
