public class Num4 {
    public static void main(String[] args) {
        /*
        반 학생이 30명이 있다.
        이들은 모두 시험을 치뤘고 모든 학생들은 60점 미만이 없다고 한다.
         이 상태에서 학생들의 점수를 임의로 배치하고
         학급의 평균값을 구해보도록 한다.
         */
        /*
        1. 배열 크기는 30명으로
        2. 60점 미만이 없다고 한다. 모든 값을 60점 이상으로 임의로 배치 -> 랜덤값으로 해야하나?
        3. 평균값 구하기 sum /30
         */

        final int STUDENT = 30;
        int []arr = new int[STUDENT];

        final int MAX = 100;
        final int MIN = 60;
        int range = MAX - MIN +1;
        int rand = 0;
        int sum = 0;

        for(int i=0;i<STUDENT;i++){
            arr[i] = (int)(Math.random()*range+MIN);
            sum += arr[i];
            System.out.printf("%d 학생의 점수는 %d\n",(i+1),arr[i]);
        }
        int avg = sum/STUDENT;

        System.out.printf("학생들의 평균은 ? %d",avg);
    }
}
