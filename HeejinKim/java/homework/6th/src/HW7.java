import java.math.BigInteger;

public class HW7 {
    public static void main(String[] args) {
        // 회사에 직원이 7명이 있습니다.
        // 모두 입사동기로 3500만원으로 시작하였다고 합니다.
        // 각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
        // 이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.
        //1.7개의 배열을 만든다
        //2.매년 인상률이 랜덤하다...랜덤으로 돌리자
        //3.5년후라고 하면 (1년후의 연봉+ 랜덤 인상률)을 반복해주자

        //7명의 직원은 고정 ,초봉 고정, 인상률 랜덤 ,5년 고정


        final int NUM = 7;
        final int FIR_PAY = 3500;
        final int YEAR = 5;
        final double MAX = 0.1;             //max값을 1000으로 해서 1000을 나눠주고 퍼센트로 계산하지 않고
        final double MIN = 0.01;            // 이렇게  0.1로 생각할 경우 제외되는 수가 있을까? 없으면 이게 더 편하지 않을까?

        float range = (float) (MAX - MIN);  // 만약 0.1~0.01사이로 했을 경우 range=MAX - MIN+1을 해줄경우
                                            // "1"라는 게 너무 커져서 해줄수가 없는데
                                            // 제대로 나오는게 맞는건가?
        float rise ;
        //1번째-- 1번째 연봉
        //2번째--(1번째 연봉*인상률)+ 1번째 연봉
        //3번째--(2번째 연봉*인상률)+ 2번째 연봉
        //4번째--(3번째 연봉*인상률)+ 3번째 연봉
        //연봉을 배열로 만들어줌
        float[] price = new float[NUM];


        for (int i = 0; i < YEAR; i++) {       //해마다>>  for문, 직원들마다 >>중첩 for문
            for (int j = 0; j < NUM; j++) {

                if (i == 0) {
                    price[j] = FIR_PAY;
                } else {
                    rise = price[j] * (float) (Math.random() * range + MIN);
                    //System.out.println(rise);
                    price[j]=price[j]+rise;

                    System.out.printf("price[%d]=%f\n",j,price[j]);
                }


            }


        }
    }
}
