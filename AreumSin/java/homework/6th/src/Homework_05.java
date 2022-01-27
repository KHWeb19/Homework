public class Homework_05 {
    public static void main(String[] args) {
        // 배열 값을 지정해주고 시작함.
        // 배열 값을 지정하지말고 랜덤으로 지정되도록해보자.

        // 분산 구하기
        // 1. 평균 값을 빼준다.
        // 2. 나온 값을 제곱.
        // 3. 제곱된걸 다 더한다.
        // 4. 주어진 갯수로 나눈다.

        // 학급수 30명, 60점 이하는 없음, 분산, 표준편차를 구해라
        final int MEMBER = 30;
        final int MAX = 100;
        final int MIN = 60;

        int range = MAX - MIN +1;

        int[] score = new int[MEMBER];

        int rand;
        float sum = 0, avg, dis = 0;
        for(int i = 0; i < MEMBER; i++){
            rand = (int)(Math.random()*range + MIN);

            score[i] = rand; // 30명에게 점수 지정함.
            sum += score[i];
        }

        System.out.println("반평균은 "+sum/MEMBER);
        avg = sum/MEMBER;

        for(int i = 0; i<MEMBER; i++){
            score[i] -= avg;
            dis += Math.pow(score[i],2);
        }

        System.out.printf("분산: %.4f\n", dis/MEMBER);
        System.out.printf("표준편차 %.4f\n",Math.sqrt(dis));

    }
}
