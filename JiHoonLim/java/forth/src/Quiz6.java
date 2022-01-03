public class Quiz6 {
    public static void main(String[] args) {

        /*
        1. for문 안에 3의 배수 조건을 걸어 출력
         */

        final int START = 1 ;
        final int END = 100 ;
        final int WANT = 3;
        final int REMAIN = 0;

        for (int i = START; i <= END; i++){
            if (i % WANT == REMAIN){
                System.out.println("3의 배수 " +i);
            }
        }
    }
}
