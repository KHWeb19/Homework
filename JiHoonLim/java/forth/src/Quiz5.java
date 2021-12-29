public class Quiz5 {
    public static void main(String[] args) {

        /*
        1. for문 안에 짝수 조건을 걸어 짝수들만 출력
         */

        final int START = 1 ;
        final int END = 100 ;
        final int EVEN = 2;
        final int REMAIN = 0;

        for (int i = START; i <= END; i++){
            if (i % EVEN == REMAIN){
                System.out.println("짝수 " +i);
            }
        }
    }
}
