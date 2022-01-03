public class Homework5 {
    public static void main(String[] args) {
       // 4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
       // 힌트: Math.sqrt() - 루트 계산
        // 표준편차...? 분산...?

        final int MAX = 100;
        final int MIN = 60;
        int range = MAX - MIN +1;

        final int START = 0;
        final int END = 30;
        int[] student = new int[END];
        int sum = 0 , num = 0;
        int avg;
        double var , sd;


        for(num = START; num < END; num++){
            int score = (int)(Math.random()*range+MIN);
            student[num] = score;

            sum +=score;
        }
          avg = sum/END;
        System.out.printf("30명 점수의 평균값 = %d\n" , avg);
         // 이 다음부터 다시 시작해야되나 합쳐서 해야되나
        //분산 ->  자료의 수에서 평균값 빼기 -> 그값의 제곱 -> 제곱한 모든 값 더하기 -> 제곱의합을 (n-1)로 나누기
        //표준편차 ->분산알기-> 분산의 제곱근 구하기(분산 값에 루트 씌우기)

        for(num = START; num < END; num++){
            var = student[num] - avg;
            var *= var; //제곱

           sum += var;
           // sum += Math.pow(student[num]-avg, 2); 구글링
        }
        var = sum/(END-1);
        sd = Math.sqrt(var);
        System.out.printf("표준편차 = %.2f\n" , var);
        System.out.printf("분산 = %.2f\n" , sd);










    }
}
