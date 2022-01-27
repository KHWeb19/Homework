public class Homework4 {
    public static void main(String[] args) {
        //반 학생이 30명이 있다.
        //이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        //이 상태에서 학생들의 점수를 임의로 배치하고
        //학급의 평균값을 구해보도록 한다.

        // 30명 모두 60점 이상
        // 점수 임의로 배치 << 60점이상 랜덤으로 배치 60~ 100점
        // 30명의 점수 평균값

        final int MAX = 100;
        final int MIN = 60;
        int range = MAX - MIN +1;

        final int START = 0;
        final int END = 30;
        int[] student = new int[END];
        int sum = 0 , avg;


        for(int num = START; num < END; num++){
            int score = (int)(Math.random()*range+MIN);
            student[num] = score;

            sum +=score;
        }
         avg = sum/END;
        System.out.printf("30명 점수의 평균값 = %d" , avg);

    }
}






