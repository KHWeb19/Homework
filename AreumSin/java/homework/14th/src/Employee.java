public class Employee {
    float pay;
    float[] ratio;

    final int MIN = 100;
    final int MAX = 1000;
    final float BIAS = 100.0f;

    int range;
    public Employee (final float firstPay) {
        pay = firstPay;

        range = MAX - MIN + 1;
    }

    public void allocIncRatio (int year) {
        ratio = new float[year];

        for (int i = 0; i < year; i++) {
            ratio[i] = ((int) (Math.random() * range + MIN)) / BIAS;
        }
    }

    public void calcPayment (int year) {
        for (int i = 0; i < year; i++) {
            pay += (pay * ratio[i] / BIAS);
        }

        System.out.printf("5년후의 연봉 = %d\n", (int)pay);
    }
}
