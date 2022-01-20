public class Homework_07 {
    public static void main(String[] args) {
        // 연봉 인상률을 int 로 지정함.
        // 연봉 인상률을 실수로 지정해서 해보자.

        // 직원 7, 초봉 3500, 5년동안 조사, 연봉 인상률 1~10%

        final int MEMBER = 7;
        final int MONEY = 35000000;
        final int YEAR = 5;

        final float BASE = 1000;
        final float PERCENT = 1/100.f;
        final float MAX = 10000; // 10.999를 처리하기 위해 10 *1000
        final float MIN = 1000;

        float range = MAX - MIN +1;
        float rand;

        float[] people = new float[MEMBER];

        for(int i = 0; i < MEMBER; i++){
            people[i] = MONEY;
        }

        for(int i = 0; i < YEAR; i++) {
            for (int j = 0; j < MEMBER; j++) {
                rand =((int) (Math.random() * range + MIN) / BASE) * PERCENT;
                // *1000했으니깐 , / 1000을 해줘야한다.
                System.out.println(rand);

                float percent = 1 + rand;

                people[j] = people[j] *percent;

                System.out.printf("%d번째 %d의 월급 %f (%f)\n", i, j, people[j], rand);

            }
        }
    }
}
