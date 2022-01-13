public class Employee {
    //회사에 직원이 7명이 있습니다.
    //모두 입사동기로 3500만원으로 시작하였다고 합니다.
    //각자의 연봉 인상률이 매년 1 ~ 10%라고 합니다.
    //이들이 5년후에 받을 연봉에 대한 시뮬레이션을 랜덤하게 돌려봅시다.

    //강사님꺼 보니깐 와따 마...
    // 멤버에 대한 클래스
    // 돈에 대한 클래스
    //이래 나누심
    //일단 돈은 초봉/ 연차에 따른 연봉 인상률
    // 멤버는 멤버 수 / 각 멤버의 인상률에 따른 연봉


    final int RATE_MAX = 1000;
    final int RATE_MIN = 100;

    final float BIAS = 100.0f;

    float[] incRatio;
    float payment;

    int range;

    // 추후에 바뀔수있는 연차나 초봉 인원수

    public Employee(final float firstPay){
        payment = firstPay;

        range = RATE_MAX - RATE_MIN + 1;

    }

    public void allocIncRatio(int year) {
        incRatio = new float[year];

        for (int i = 0; i < year; i++) {
            incRatio[i] = ((int) (Math.random() * range + RATE_MIN)) / BIAS;
            // 100<= rate < 1000      1<= rate < 10
        }
    }

    public void calcPayment(int year) {
        for (int i = 0; i < year; i++) {
            // 근데 10이 포함이안되는데 0.01<= rate < 0.1  10퍼는 없는거 아닌가?
            payment += (payment * incRatio[i] / BIAS);


        }
        System.out.println((int)payment);
    }
}
