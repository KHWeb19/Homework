public class Quiz4 {
    public static void main(String[] args) {

        /*
        1. STAGE = 원하는 단수
        2. for 문에서 구구단 생성
         */
        final int STAGE = 7;
        final int START = 1;
        final int END =10;

        for (int i = START; i < END; i++){
            System.out.println(STAGE+ " * " +i+ " = " + START*i );
        }
    }
}
