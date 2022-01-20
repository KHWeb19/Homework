public class Homework04 {
    public static void main(String[] args) {

        // 반 학생이 30명이 있다.
        // 이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        // 이 상태에서 학생들의 점수를 임의로 배치하고
        // 학급의 평균값을 구해보도록 한다.

        // 반 학생 30명 = 배열
        // 60점 미만이 없는 경우 : MIN = 60 MAX = 100
        // 학생들의 성적 임의 배치 = 배열에 랜덤배치
        // 평균값 = 학생들의 성적합 나누기 학생 수

        final int STUDENTS = 30;

        final int MIN = 60;
        final int MAX = 100;
        int range = MAX - MIN + 1;

        int sum = 0;

        int [] score = new int [STUDENTS];

        for(int i = 0; i < STUDENTS; i++){

            int rand = (int)(Math.random() * range + MIN);

            score[i] = rand;

            System.out.printf("학생 %d의 성적 : %d\n", i+1, score[i]);

            sum += score[i];

        }

        System.out.println("학생들의 평균 = " + sum/STUDENTS);
    }
}
