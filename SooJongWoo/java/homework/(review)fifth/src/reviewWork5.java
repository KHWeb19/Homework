public class reviewWork5 {
    public static void main(String[] args) {
        final int STUDENTS_NUM = 30;
        final int MAX = 100;
        final int MIN = 60;

        int[] score = new int [STUDENTS_NUM];

        int range = MAX - MIN + 1; // 최대값 지정
        float sum = 0;
        float average; // average를 float형식으로 지정

        for (int i = 0; i < STUDENTS_NUM; i++) {
            score[i] = (int)(Math.random() * range + MIN);
            sum += score[i];

            System.out.printf("score[%d] = %d\n", i, score[i]);
        }

        average = sum / STUDENTS_NUM;
        // average(평균) 공식 작성
        System.out.println("평균 = " + average);
        // 평균값 출력

        sum = 0; // sum은 0이라고 다시 지정

        for (int i = 0; i < STUDENTS_NUM; i++) {
            sum += Math.pow(score[i] - average, 2);
            // sum = 학생 각점수에서 평균을 빼고 제곱을 해준 후 모두 더한다
        }

        System.out.println("분산 = " + (sum / STUDENTS_NUM));
        // 분산 = 학생 각 점수를 평균에서 빼고 제곱해서 더한 값을 학생수로 나누어준다
        System.out.println("표준편차 = 루트 분산 = " + Math.sqrt(sum / STUDENTS_NUM));
        // 표준편차 = 분산값을 루트 씌어주면 된다
    }
}

//  1. 학생수가 30이므로 고정값으로 두기
//  2. 시험점수가 60점 미만이 없기 때문에 MIN = 60, MAX = 100으로 두기
//  3. 학생 점수를 랜덤으로 생성하기
//  4. 학생 점수를 나열할수 있도록 배열로 풀기
//  5. 분산을 구하기 위해 Math.pow(/)를 사용하기
//  6. 표준편하를 구하기 위해 Math.sqrt(/)를 사용하여 분산값에서 루트해주기