public class InCome {

    final int MAX = 10000;
    final int MIN = 1000;

    final int MEMBER = 7;
    final int STARTPAY = 3500;

    final int YEAR = 5;

    final float BIAS = 1000;
    final float PERCENT = 1 / 100.f;

    int range;
    float percent;

    int[] pay = new int[MEMBER];

    public void init_income(){
        range = MAX - MIN +1;
    }

    public float random(){
        percent = (float)((int) (Math.random() * range + MIN) / BIAS) * PERCENT;
        // 1000             10000   // 1000 ~ 10000 / 1000
        return percent; // 0.01 ~ 01
    }

    public int money(){

        for(int i =0; i < MEMBER; i++){ // 0 1 2 3 4
            pay[i] = STARTPAY;
        }// 기본 금액을 더한다.

        for(int i = 0; i < YEAR; i++){
            for(int j = 0; j < MEMBER; j++){
                random();

                pay[j] += (pay[j] * percent);

                return pay[j];

            }

        }

        return 0;
    }
}
