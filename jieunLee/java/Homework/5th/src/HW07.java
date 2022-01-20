public class HW07 {
    public static void main(String[] args) {
        //7. 회사에 직원이 7명이 있습니다.
        //   모두 입사동기로 3500만원으로 시작하였다고 합니다.
        //   각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        //   이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

        //1) 직원의 5년후 연봉 구하기
        //2) 반복문으로 7명 구하기

        int rand;
        double salary;
        final int NUM = 7;
        final int MIN = 1;
        final int MAX = 10;
        final int YEAR = 5;
        //2)
        for (int j=0; j<NUM; j++) {
            salary = 35000000;
            //1)
            for (int i=1; i<YEAR+1; i++) {
                rand = (int)(Math.random()*(MAX-MIN+1)+MIN);
                salary = salary*(1+(0.01*rand));
            }
            System.out.printf("직원%d %.0f원\n", j+1, salary);
        }






    }
}
