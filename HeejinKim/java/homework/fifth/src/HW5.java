public class HW5 {
    public static void main(String[] args) {

        //표준편차와 분산을 구하도록 한다
        //1번 식 분산= 편차(점수-평균)의 제곱/학생수
        //2번 식 분산= 제곱의 평균-평균의 제곱
        final int STUDENTS = 30;
        final int MAX = 100;
        final int MIN = 60;
        int[] arr = new int[STUDENTS];
        int range = MAX - MIN + 1;
        int sum = 0;
        int avg;
        int i;
        int sqrtSum=0;    //제곱의 합
        int avgSqrt;    //평균의 제곱
        int sqrtSumAvg; //제곱의 합의 평균
        int variance;   //분산
        int stand;      //표준편차


        for (i = 1; i < STUDENTS; i++) {

            int score = (int) (Math.random() * range + MIN);

            arr[i] = score;
            System.out.printf("%d\n", arr[i]);

            sum += arr[i];                                //점수들의 합

            sqrtSum= sqrtSum+(int)(Math.pow(arr[i],2));   //점수들의 제곱의 합


        }
        sqrtSumAvg= sqrtSum/STUDENTS;                 //점수 제곱의 합 의 평균
        avg = sum / STUDENTS;                         //평균
        avgSqrt=(int)Math.pow(avg,2);                 //평균의 제곱
        variance=sqrtSumAvg- avgSqrt;                 //분산
        stand=(int)Math.sqrt(variance);               //표준편차

        System.out.printf("제곱의 합:%d\n",sqrtSum);
        System.out.printf("제곱의 합의 평균:%d\n",sqrtSumAvg);
        System.out.printf("평균의 제곱:%d\n", avgSqrt);
        System.out.printf("분산:%d\n",variance);
        System.out.printf("표준편차:%d\n",stand);


    }
}
