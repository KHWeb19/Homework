public class Practice4 {
    public static void main(String[] args) {
        //문제4. 반 학생이 30명이 있다.
        //   이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
        //   이 상태에서 학생들의 점수를 임의로 배치하고
        //   학급의 평균값을 구해보도록 한다.

        final int START = 1;
        final int END = 30;

        int[] student = new int[END];

        final int MIN = 60;
        final int MAX = 100;
        int range = MAX - MIN + 1;

        int sum = 0; //우선 sum 메모리에 들어가는 숫자를 0으로 설정한다.

        // 1. arr[0~29] = 60~100사이의 숫자가 출력 되도록한다.
        // 1_1. for문 안에 넣어서 반복시킨다.
        for(int i = 0; i < END; i++){

            // 1_2. 점수는 for문 안에 Math.random()을 넣고 랜덤으로 출력한다.
            int random = (int)(Math.random() *range + MIN);
            student[i] = random;
            System.out.printf("학생번호[%d] = 시험점수 %d\n", i, random);

            // 1_3. 반복마다 매회 random() 결과로 나온 숫자를 int score에 남긴다.
            // 1_4. sum += score로 반복마다 점수의 합을 기록한다.
            int score = random;
            sum += score;
        }

        // 2. sum을 학생수(30)로 나누어주어 평균값을 출력한다.
        System.out.printf("우리반 학생 %d 명의 점수의 평균 = %d", END, sum/END);


    }
}