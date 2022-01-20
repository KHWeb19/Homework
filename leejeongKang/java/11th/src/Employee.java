public class Employee {
    float payment;
    float [] incRatio; //연봉상승률 1~10% => 1.00~ 10.00

    final int MIN = 100;
    final int MAX = 1000;

    final float BIAS = 100.0f;

    int range;

    public Employee (final float firstpay){
        payment = firstpay;

        range = MAX - MIN + 1;
    }

    public void allocIntRatio (int year){
        incRatio = new float [year];

        for (int i =0; i< year; i++){
            incRatio[i] = (int)(Math.random()*range+MIN);
        }
    }
    public void calcPayment (int year) {
        for (int i =0; i <year; i++){
            payment += (payment*incRatio[i]/BIAS);
        }
        System.out.printf("5년 후의 연봉 %d\n", (int)payment);
    }
}
