public class Hw7 {
    public static void main(String[] args) {
        //회사에 직원이 7명이 있습니다.
        //모두 입사동기로 3500만원으로 시작하였다고 합니다.
        //각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        //이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

        //직원이 7명이니 배열을 7개 할당하면 되겠군..
        //3,500만원을 초기값으로 설정하면 되는건가...
        //각자의 연봉 인상률이 매년 1 ~ 10%니 랜덤함수를 사용하면 되겠군...
        //5년 후에 받을 연봉이니 매년 연봉에서 인상률을 곱하고 다음 해는 인상된 연봉에 인상률을 곱해야겠군...

        final int EMP_NUM = 7; //직원 수가 7명이므로 7로 설정
        final int INIT_SALARY = 3500;  //초봉이 3,500이므로 3,500으로 설정

        //연봉 인상률이 1 ~ 10프로인데 MAX 값을 10으로 MIN 값을 1로 잡으면 소수점 자리 표현이 안됨
        //그래서 MAX 값을 10000으로 잡고 MIN 값을 1000으로 잡아 나누기 1000을 하여 설정
        final int MAX = 10000;
        final int MIN = 1000;
        final int END_YEAR = 5;  //5년 후 받는 연봉이므로 5로 설정
        final float BIAS = 1000;
        final float PERCENT = 1 / 100.f; //나온 랜덤 값에 0.01을 곱해줘야 하므로 1 / 100 으로 설정..

        int range = MAX - MIN + 1;
        float percent;

        float[] emp = new float[EMP_NUM];

        for (int i = 0; i < EMP_NUM; i++) { //배열은 0부터 시작하므로 직원1을 0으로 설정
            emp[i] = INIT_SALARY;  //초봉 설정
        }

        for (int i = 1; i < END_YEAR; i++) {
            //배열은 0부터 시작하고 2년 후 받는 연봉부터 계산하므로 i = 1로 설정
            //5년 후 연봉이지만 배열은 0부터 시작하므로 i < END_YEAR 로 설정,등호가 들어가면 안된다.
            for (int j = 0; j < EMP_NUM; j++) {
                //직원 1부터 직원 7까지 연봉을 나타내기 위해
                //배열은 0부터 시작하므로 j = 0으로 설정 후 EMP_NUM 은 등호가 들어가면 안된다.

                // (int) (Math.random() * range + MIN) - 1000 ~ 10000: A
                // A / BIAS = 1 ~ 10: B
                // B * PERCENT = 0.01 ~ 0.1
                percent = (float) ((int) (Math.random() * range + MIN) / BIAS) * PERCENT;
                // 1%의 인상률이라면
                // 최종 연봉 = 현재 연봉 + 현재 연봉 * 인상률
                //          = 현재 연봉 * (1 + 인상률)
                // emp[j] = emp[j] * (1 + percent);
                emp[j] += (emp[j] * percent); // emp[j] = emp[j] + emp[j] * percent

                System.out.printf("연봉[%d] = %f, 증가율 = %f\n", j, emp[j], percent);
            }

            System.out.println(); //해가 바뀔 때마다를 구분해 주기 위해서 입력

        //int[] employee = new int[END];


        /*final int SALARY = 3500; //연봉의 초기값
        for (int i = START - 1; i < END; i++) { //배열은 0부터 시작하므로 START 값에서 1을 빼준다...
            employee[i] = SALARY;  //첫 해 받는 연봉
            //System.out.println("arr[%d]: %d\n",i,employee[i]);
        }
        for (int i = 1; i < END_YEAR; i++) {
            for (int j = 0; j < END; j++) {  //첫 해는 받았으므로 j=2부터 수행, 5년 후 연봉이므로...
                int rand = (int) (Math.random() * range + MIN);
                employee[j] = employee[j] + (employee[j] * (rand / 100));
                System.out.printf("arr[%d]: %d\n ", j, employee[j]);*/

        }


    }


}
