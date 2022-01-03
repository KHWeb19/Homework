public class Homework5 {
    public static void main(String[] args) {

        // 1 ~ 100까지 숫자중 짝수만 출력

        // 변할 수 있는 값은 모두 변수처리 해주면 좋음.
        // ex. final int START = 1 ;
        //     int i = START


        for(int i = 1; i <= 100; i++){

            if(i % 2 == 0){

                System.out.printf("짝수 = %d\n", i);

            }
        }
    }
}
