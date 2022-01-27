public class Homework_04 {
    public static void main(String[] args) {
        // 배열 값을 지정해주고 시작함.
        // 배열 값을 지정하지말고 랜덤으로 지정되도록해보자.

        // 학급수 30명, 60점 이하는 없음, 평균을 구해라
        final int MEMBER = 30;
        final int MAX = 100;
        final int MIN = 60;

        int range = MAX - MIN +1;

        int[] score = new int[MEMBER];

        int rand;
        int sum = 0;
        for(int i = 0; i < 30; i++){
            rand = (int)(Math.random()*range + MIN);

            score[i] = rand; // 30명에게 점수 지정함.
            sum += score[i];
        }

        System.out.println("반평균은 "+(float)sum/MEMBER);

    }
}
