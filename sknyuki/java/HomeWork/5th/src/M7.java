public class M7 {
    public static void main(String[] args) {
        //회사에 직원이 7명이 있습니다.
        //   모두 입사동기로 3500만원으로 시작하였다고 합니다.
        //   각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        //   이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.


        // 최종 연봉 = 현재 연봉 + 현재 연봉 * 인상률
        //          = 현재 연봉 * (1 + 인상률)
        //직원수=>MAXARRAY

        final int MAXARRAY = 7;//인원
        final float FIRSTSALARY = 3500;//처음 연봉값

        final int MAX = 10000;
        final int MIN = 1000;//인상률 범위 계산용
        final int END = 5;//for문 연차 반영용
        final float BIAS = 1000;
        final float PERCENT = 1 / 100.f;

        int range = MAX - MIN + 1;//인상률

        float[] member = new float[MAXARRAY];//직원 배열화
        float percent;
        for(int i=0;i<MAXARRAY;i++){
            member[i]= FIRSTSALARY;
        }



        for (int i = 0; i < END; i++) {//5년간 인상률 반영해서 증가시키는 루프
            for (int j = 0; j < MAXARRAY; j++) {//직원 7명에게 위 루프를 순차적으로 반영 루프
                // percent = (float) ((int) (Math.random() * range + MIN)  * 0.01)
                percent = ((int) (Math.random() * range + MIN) / BIAS) * PERCENT;

                member[j]+=(member[j]*percent);
                //현재연봉+=(현재연봉*인상률)
                // 최종 for문 3번 나왔을때는
                // 현재연봉=(1년전연봉+(2년전 연봉*인상률)) 복리 인상률

                System.out.printf("연봉[%d] = %f, 증가율 = %f\n", j, member[j], percent);
            }
            System.out.println();
        }
    }
}