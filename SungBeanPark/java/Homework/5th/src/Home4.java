//반 학생이 30명이 있다.
//이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
//이 상태에서 학생들의 점수를 임의로 배치하고
//학급의 평균값을 구해보도록 한다.
public class Home4 {
    public static void main(String[] args) {
        int num = 30;                    // 학생수
        int[] score = new int[num];      // 점수배열
        int sum = 0;                     // 총점을 저장하기 위한 변수
        float average;                   // 평균을 저장하기 위한 변수
        final int MIN = 60;              // 60점 이상
        final int MAX = 100;             // 100점까지
        final int range = MAX - MIN + 1; //범위

        for(int i = 0; i < num; i++){
            int rand = (int)(Math.random() * range + MIN); //60이상 임의의 점수
            score[i] = rand;
            System.out.println("학생들의 점수 : " + score[i]);
            sum += score[i];
        }
        average = sum/num;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }
}

