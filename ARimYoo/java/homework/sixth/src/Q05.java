public class Q05 {
    public static void main(String[] args) {

        // 표준편차 구하는 방법
        // 1. 평균을 구한다
        // 2. 각 인덱스의 값이 평균으로 부터 떨어진 값의 제곱을 구한다.
        // 3. 2단계의 값을 모두 더한다
        // 4. 얻은 값을 총 학생 수로 나눈다.  ---> 여기까지가 분산
        // 5. 루트를 씌운다

        final int START = 0;
        final int STUDENT = 30;

        final int MAX = 100;
        final int MIN = 60;
        int range = MAX - MIN + 1;

        int [] score = new int[STUDENT];
        float sum = 0; // 소숫점이 나오는 경우도 있으니


        ///// 학생들의 평균 구하기

        for (int i = START; i < STUDENT; i++){

            int randScore = (int)(Math.random() * range + MIN);
            score[i] = randScore; // 랜덤 평균값 할당
            System.out.printf("%d 학생의 점수 : %d\n", i+1, score[i]);
            sum += score[i];

        }

        System.out.printf("학생들의 평균 : %f\n", sum/STUDENT);
        float average = sum/STUDENT;

        sum = 0; // sum값 초기화. 따로 sum2를 만들지 않고 이렇게 재활용 가능.


        ///// 분산과 표준편차 구하기

        for (int i = START; i < STUDENT; i++){

            //제곱을 구하는 것 = Math.pow 활용
            sum += Math.pow(average - score[i], 2); // --> 평균에서 점수를 뺀 값의 2승 (제곱)

        }

        System.out.println("분산 = " + sum / STUDENT);
        System.out.println("표준편차 = " + Math.sqrt(sum / STUDENT));

    }
}
