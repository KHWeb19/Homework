public class Quiz9 {
    public static void main(String[] args) {

        /*
        1. while문(true)으로 랜덤 수 생성 하고 논리값 변경(false)으로 종료
        2. if문에서 생성한 수의 배수인지 판별 하고 맞다면 sum에 합
        3. 아니라면 다시 루프 반복
        4. 루프가 끝나면 sum에 누적값 출력
         */

        final int START = 1 ;
        final int END = 100 ;
        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN +1 ;

        boolean isRandom = false;
        int sum = 0;
        int rand= 0;

        for (int i = START; i <= END; i++){
            while (!isRandom){
                rand = (int)(Math.random()*range+MIN);
                isRandom = true;
            }

            if (i % rand == REMAIN){
                System.out.println(rand+ " 의 배수 " +i);
                isRandom = false;

                sum += i;
            }
        }
        System.out.println("총합은 " +sum );
    }
}
