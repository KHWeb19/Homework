public class Quiz8 {
    public static void main(String[] args) {

        /*
        1. 1~100 까지 rand의 배수를 구한다.
        2. rand 값의 배수를 if문 조건으로 걸러내고 출력
         */

        final int START = 1 ;
        final int END = 100 ;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN +1 ;
        int rand = (int)(Math.random()*range+MIN);

        for (int i = START; i <= END; i++){
            if (i % rand == REMAIN){
                System.out.println(rand+ "의 배수 " +i);
            }
        }
    }
}
