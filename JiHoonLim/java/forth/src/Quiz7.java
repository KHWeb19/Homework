public class Quiz7 {
    public static void main(String[] args) {

        /*
        1. for문 안에 4의 배수 조건을 걸어 4의 배수들만 출력
        2. 4의 배수들을 sum값에 저장
        3. sum의 누적값 출력
         */

        final int START = 1 ;
        final int END = 100 ;
        final int WANT = 4;
        final int REMAIN = 0;

        int sum = 0;

        for (int i = START; i <= END; i++){
            if (i % WANT == REMAIN){
                sum += i;
            }
        }
        System.out.printf("%d ~ %d까지 %d의 배수들의 합은  %d\n",START,END,WANT,sum);
    }
}
