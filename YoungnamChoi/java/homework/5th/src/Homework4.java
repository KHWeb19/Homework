import java.util.SortedMap;

public class Homework4 {
    public static void main(String[] args) {

        // 반 학생이 30명이 있다.
        //   이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        //   이 상태에서 학생들의 점수를 임의로 배치하고
        //   학급의 평균값을 구해보도록 한다.

        /*
        1.30명의 점수가 있는 배열을 만든다.
        2.배열안의 임의의 점수를 부여한다.
        3.점수를 한 곳에 합 한 변수를 만든다.
        4.for문을 이용하여 배열 변수를 하나씩 불러와서 sum이라는 곳에 저장한다.
        4.합 한 변수를 이용하여 평균을 구한다.
         */

        int[] scores;
        scores= new int[] {100,80,75,65,85,95,90,93,82,75,
                70,70,70,65,100,89,71,68,82,88,
                92,66,74,78,82,90,100,100,95,90};

        int sum =0;

        for(int i = 0; i<30; i++){
            sum += scores[i]; //scores의 배열을 넣어야만 오루가 나오지 않고 sum에 변수를 합 할 수 있다.
        }
        double avg = (double) sum/30;
        System.out.println("평균 : " +avg);
    }
}
