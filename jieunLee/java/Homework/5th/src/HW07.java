public class HW07 {
    public static void main(String[] args) {
        //7. 회사에 직원이 7명이 있습니다.
        //   모두 입사동기로 3500만원으로 시작하였다고 합니다.
        //   각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        //   이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

        //1) 각 직원의 1년후 인상된 연봉 구하기
        //   인상률 구하기 - 고정된 소수점만큼 구하려면 랜덤범위에 BIAS곱하고 구한 랜덤값에 BIAS나누기
        //2) 반복문으로 5년후 구하기

        final int NUM = 7;
        final float INIT_PAY = 35000000;

        final int MIN = 1;
        final int MAX = 10;
        final int YEAR = 5;
        final float BIAS = 10000;

        double percent;
        float range = BIAS*(MAX-MIN)+1;

        float[] arr = new float[NUM];
        for (int i=0; i<NUM; i++) {
            arr[i] = INIT_PAY;
        }

        for (int i=1; i<=YEAR; i++) {
            System.out.println(i + "년 후");
            for (int j=0; j<NUM; j++) {
                percent = (int)(Math.random()*range+BIAS*MIN)/BIAS*0.01;
                arr[j] += (arr[j]*percent);
                System.out.printf("직원%d %.0f원 %f\n", j, arr[j], percent);
            }
        }
    }
}
