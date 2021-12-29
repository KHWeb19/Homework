public class Practice5_1 {
    public static void main(String[] args) {
        //문제4.  4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다. _ 12/28
        // Answer4, 5를 참고하여 score[i]를 사용하고, 값을 float로 형변환도 해보았다.
        //   힌트: Math.sqrt() - 루트 계산

        final int START = 1;
        final int END = 30;

        int[] score = new int[END];

        final int MIN = 60;
        final int MAX = 100;
        int range = MAX - MIN + 1;

        boolean check = false;
        int sum = 0; //우선 sum 메모리에 들어가는 숫자를 0으로 설정한다.

        for (int i = 0; i < END; i++) {

            score[i] = (int) (Math.random() * range + MIN);

            System.out.printf("학생번호[%d] = 시험점수 %d\n", i, score[i]);

            // sum += score로 반복마다 점수의 합을 기록한다.

            sum += score[i];
        }

        int average = sum/END;

        // 평균2. sum을 학생수(30)로 나누어주어 평균값을 출력한다.
        System.out.printf("우리반 학생 %d 명의 점수의 평균 = %d\n", END, average);

//-----------------------------------------------------------------------------------------
        //분산: 주어진 자료의 숫자가 평균을 기준으로 어떻게 흩어져 있는지 나타내는 지표이다.
        //분산1.30개의 score마다 평균값(sum/END) 빼기
        //분산2.평균값을 빼고 나온 값을 제곱하기

        sum = 0; // sum 값을 다시 0으로 바꿔준다.
                 // 평균 구하기까지의 sum은 영향을 받지 않는다.

        for (int i = 0; i < END; i++) {
            sum += Math.pow(score[i] - average, 2);
            // 30번 반복되며 (score[i]-평균값)에 제곱한 값을 sum에 + 해준다. (sum에 누적도 됨)
            //Math.pow는 제곱을 할 수 있게 해준다. Math.pow(x, n^)

            //분산3.모든 값을 더하기 - 완료
        }
        //분산4.제곱의 합을 (학생수-1)로 나누기 = 분산
        //n-1을 하는 이유는 표본 분산과 모분산을 분리하기 위해서이다.

        System.out.println("우리반 학생 점수의 분산 값 = " + (float)(sum) / (END-1));

        float variance = sum / (END-1);
        //표준편차: 주어진 자료의 숫자가 평균을 기준으로 어떻게 흩어져 있는지 나타내는 지표이다.
        //표준편차1. 분산 값에 루트를 씌워 제곱근을 구하면 표준편차가 나온다.
        //          제곱근이란? 어떤 수 x를 제곱한 수가 a 인 , x가 a의 제곱근이다.

        System.out.println("우리반 학생 점수 표준편차 값 = " + Math.sqrt(variance));

    }
}
