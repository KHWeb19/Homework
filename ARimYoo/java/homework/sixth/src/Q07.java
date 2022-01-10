public class Q07 {
    public static void main(String[] args) {

        // 선생님의 방식으로 풀어보기

        final int PEOPLE_NUM = 7;
        final float FIRST_PAY = 3500; // 인상률은 소숫점도 포함하므로..
        final int YEAR = 5;

        final int MAX = 10000;
        final int MIN = 1000;
        final float BIAS = 1000f;
        final float PERCENT = 0.01f;
        int range = MAX - MIN + 1;

        /// ----> 1.0 ~ 10.0 사이의 소수점 값을 생성하기 위한 작업.
        /// Math.random() * 10 + 1 => 1~ 10.99999 사이의 값
        /// Math.random() * 10000 + 1000 => 1000~ 10000.99999 사이의 값
        /// ---> 얘를 int 값으로 처리하면 1000 1001 1002 ..... 10000
        /// ---> float값인 BIAS (1000.00) 으로 나누게 되면 1 1.1 1.2 ..... 10.0
        /// 따라서 소숫점을 포함한 모든 인상률 ex. 2.4%와 같은 숫자를 구할 수 있게됨

        float[] PEOPLE = new float[PEOPLE_NUM];

        for (int i = 0; i < PEOPLE_NUM; i++) {

            PEOPLE[i] = FIRST_PAY;

        }

        for (int i = 1; i < YEAR; i++) {
            for (int j = 0; j < PEOPLE_NUM; j++) {

                float percent = (int) (Math.random() * range + MIN) / BIAS * PERCENT;
                PEOPLE[j] += PEOPLE[j] * percent;
                float percent2 = percent * 100;
                System.out.printf("%d의 %d년 후 연봉 : %f / 증가율 : %f\n", j+1, i, PEOPLE[j], percent2);

            }

            System.out.println();

        }
    }
}
