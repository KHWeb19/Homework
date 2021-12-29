public class Quiz7 {
    public static void main(String[] args) {
        /*
        1. 첫 for문에서 직원 7명의 연봉 넣기
        2. 두번째 for문에서 5년치 연봉 인상하기
        3. 출력하기
        4. 인상작업을 어떻게 해야할까 --> 문제풀이로 해결

         */
        // 연봉률 작업 시 10%를 초과하지 않기 위해서 MIN, MAX 값 조정 (나중에 나눠서 작업하기 위함)
        final int PEO = 7;
        final int YEAR =5;
        final float START = 3500;
        final int MAX = 1000;
        final int MIN = 100;
        final float BIAS = 1000;
        final float PERCENT = 1 / 100.f;

        int range = MAX - MIN +1;
        float percent ;

        float[] emp = new float[PEO];

        // 첫 연봉 작업
        for (int i = 0; i < PEO; i++){
            emp[i] = START;
        }
        // n년마다
        for (int i =0; i < YEAR; i++){
            System.out.println(i+1 + "년");

            //인상
            for (int j = 0; j < PEO; j++){
                // 인상률 = (랜덤인상률 / 1000) X 0.01
                percent = ((int) (Math.random() * range + MIN) /BIAS ) * PERCENT;

                // 연봉배열 = 기존연봉 + (기존연봉 X 인상률)
                emp[j] += (emp[j] * percent);

                System.out.printf("연봉[직원 %d] = %f\n", j+1 ,emp[j]);
            }
            System.out.println();
        }
    }
}
