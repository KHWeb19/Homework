public class Ans7 {
    public static void main(String[] args) {
        // 회사에 직원이 7명이 있습니다.
        // 모두 입사동기로 3500만원으로 시작하였다고 합니다.
        //  각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다. 100분의 1 0.01  10퍼는 100분의 10 0.1 맞나?ㅎㅎ
        // 0.01~ 0.1   0< Rnd < 0.09 0.01<= rad < 0.11 이러면 막 0.012 퍼도 나올듯?
        //인상율은 1퍼 2퍼 3퍼 4퍼 5퍼 6퍼 ... 10퍼 일텐데
        //  이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

        // 7명 모두 3500 배열에 넣나 ㅎㅎ
        // 인상률 -> 랜덤
        // 5년후 -> 5번 연봉이 오름

        // 연봉 인상률은 1퍼 2퍼 3퍼로 떨어지는게 아니라 소수점 까지 구하는 거였음

        //final int START = 0;
        //final int END = 7;
        final int EMP_NUM = 7;
        final int INIT_PAY = 3500;
        final int MAX = 10000;
        final int MIN = 1000;
        //final double PAY = 3500;
        //int  pay = 3500;
        final int END_YEAR = 5;
        final float BIAS = 1000;
        final float PERCENT = 1 / 100.f;


        int range = MAX - MIN + 1;
        float percent;

        //int[] people = new int[END];
        int[] emp = new int[EMP_NUM];



        for(int i = 0; i < END_YEAR; i++){ //연차당 개인의 연봉인상률을 구하면 되니깐 중복 for문을 활용
            //people[num] = pay;
            for(int j = 0; j < EMP_NUM; j++) {
                //int rate = (int) (Math.random() * range + MIN); // 0 <= rate < 1 0<= rate < 9 1<= rate < 10 1/100
                percent = (float) ((int) (Math.random() * range + MIN / BIAS) * PERCENT);
               /* rise = pay * rate / 100; // 계속 0으로 작동
                risePay = (int) pay + rise; // 인상된 연봉에서 또 인상?? 이렇게 되면 소수점 까지 뜨게됨 근데 오른거에서 오르는게 당연하자나 그럼 doulbe형을 int형으로 바꿔야되나
                pay = risePay; // pay를 final로 고정시키니 작동이 안됐음*/
                emp[j] += (emp[j] * percent);

                //System.out.printf("%d년차 연봉 인상률  = %d%%, 연봉 = %d\n", year + 1, rate, risePay);
                System.out.printf("연봉[%d] = %f, 증가율 = %f\n", j, emp[j], percent);





            }

            System.out.println();


        }






    }
}
