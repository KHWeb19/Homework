public class Homework_04 {
    public static void main(String[] args) {
        //4. 반 학생이 30명이 있다.
        //   이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        //   이 상태에서 학생들의 점수를 임의로 배치하고
        //   학급의 평균값을 구해보도록 한다.
        final int MEMBER = 30;

        int[] score = { 62, 63, 75, 78, 90, 82, 84, 86, 92, 97,
                        61, 64, 75, 88, 96, 82, 64, 96, 72, 68,
                        72, 93, 85, 78, 99, 72, 87, 89, 62, 95};

        int result = 0;

        for (int i = 0; i < score.length; i++){
            result += score[i];
        }

        System.out.println(result/MEMBER);

    }
}
