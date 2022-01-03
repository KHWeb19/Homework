public class M7 {
    public static void main(String[] args) {
        //회사에 직원이 7명이 있습니다.
        //   모두 입사동기로 3500만원으로 시작하였다고 합니다.
        //   각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        //   이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

        //연봉=>현재 연봉*(1+인상률)
        //직원수=>MAXARRAY

        final int MAXARRAY = 7;//인원
        final int MAX = 10;
        final int MIN = 0;//인상률 범위 계산용
        final int START = 0;
        final int END = 5;//for문 연차 반영용

        int range = MAX - MIN + 1;//인상률
        int increase;
        int[] member = new int[MAXARRAY];//직원 배열화

        int sum = 0;
        //5년후 총합 인상률
        for (int i = START; i <= END; i++) {
            increase = (int) ((int) (Math.random() * range + MIN) * 0.01);//인상률
            sum += increase;

        }
        int j;//초기 연봉
        for (j = 1; j < MAXARRAY; j++) {
            member[j] = 3500;
        }
        int totalSalary = member[j]*(1+sum);//현재 연봉=>과거 연봉*(1+인상률)
        System.out.printf("사원 %d의 연봉이 총 %d퍼센트 올랐습니다. 현재 연봉: %d\n",j,sum,totalSalary);
        //에러로 인해 실행이 안되어 확인을 못했습니다.
        //j값 범위밖이라네요
    }

}
