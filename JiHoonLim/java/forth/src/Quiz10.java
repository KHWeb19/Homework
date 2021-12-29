public class Quiz10 {
    public static void main(String[] args) {

        /*
        1. for문 안에서 랜덤 수 생성
        2. sum에 이동한 값 더하기
        3. 이동한 누적값 출력
         */

        final int START = 1 ;
        final int END = 100 ;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN +1 ;

        int sum = 0;
        int rand;

        for (int i = START; i <= END; i+=rand){
            rand = (int)(Math.random()*range+MIN);

            System.out.println("나온 수는 " +rand+ " 현재 이동한 위치는 " +i);

            sum += i;
       }
        System.out.println("총합은 " +sum);
    }
}
