public class Ans5 {
    public static void main(String[] args) {
        // 4번 문제에서 평균을 구했으므로 표준편차와 분산을 구하도록 한다.
        // 힌트: Math.sqrt() - 루트 계산


        final int MAX = 100;
        final int MIN = 60;
        int range = MAX - MIN +1;

        //final int START = 0;
        //final int END = 30;
        final int STUDENT_NUM = 30; // Q. 변수명을 변경할때 밑에 있는 똑같은 변수명도 다 같이 바꿔야하는데 동시에 바꾸는게 없는지 궁금함
        //int[] student = new int[STUDENT_NUM];
        int[] score = new int[STUDENT_NUM];
        //int sum = 0 ;
        //int avg;
        float sum = 0; // 0은 float값인데 0뒤에 f를 안붙여도 되나보다
        float avg;
        //double var , sd;


        for(int i = 0; i < STUDENT_NUM; i++){
             score[i] = (int)(Math.random()*range+MIN);
           // student[num] = score;

            sum +=score[i];
        }
        avg = sum/STUDENT_NUM;
        System.out.println("30명 점수의 평균값 = " + avg);
        // 이 다음부터 다시 시작해야되나 합쳐서 해야되나
        //분산 ->  자료의 수에서 평균값 빼기 -> 그값의 제곱 -> 제곱한 모든 값 더하기 -> 제곱의합을 (n-1)로 나누기
        //표준편차 ->분산알기-> 분산의 제곱근 구하기(분산 값에 루트 씌우기)

        for(int i = 0; i < STUDENT_NUM; i++){
            /*var = student[num] - avg;
            var *= var; //제곱

            sum += var;*/
            sum += Math.pow(score[i]-avg, 2);
        }
        //var = sum/(STUDENT_NUM-1);
        //sd = Math.sqrt(var);
        System.out.println("분산 = " + (sum / STUDENT_NUM));
        System.out.println("표준편자 =" +  Math.sqrt(sum / STUDENT_NUM));

    }
}
