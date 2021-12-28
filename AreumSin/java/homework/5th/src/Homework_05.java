public class Homework_05 {
    public static void main(String[] args) {
        //4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
        //
        //   힌트: Math.sqrt() - 루트 계산

        // System.out.println(Math.sqrt(9));

        final int MEMBER = 30;

        int[] score = { 62, 63, 75, 78, 90, 82, 84, 86, 92, 97,
                        61, 64, 75, 88, 96, 82, 64, 96, 72, 68,
                        72, 93, 85, 78, 99, 72, 87, 89, 62, 95};

       // 분산 구하기
        // 1. 평균 값을 빼준다.
        // 2. 나온 값을 제곱.
        // 3. 제곱된걸 다 더한다.
        // 4. (주어진 갯수-1)로 나눈다.

        int result = 0;
        int avg, sum = 0;
        int dis; // 분산을 나타내는 변수

        for (int i = 0; i < score.length; i++){
            result += score[i];
        }

        //System.out.println(result/MEMBER);
        avg = result/MEMBER;

        for (int i = 0; i < score.length; i++){
            score[i] -= avg;
            score[i] *= score[i];

            sum += score[i];
        }
        dis = sum / MEMBER-1;

        System.out.println(dis);


        // 표준 편차 구하기
        // 1. 분산의 제곱근 구하기

        System.out.println(Math.sqrt(dis));
    }
}
