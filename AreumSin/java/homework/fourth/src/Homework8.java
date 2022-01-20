public class Homework8 {
    public static void main(String[] args) {
        //8. 1 ~ 100까지 숫자를 순회한다.
        //
        //   2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.

        // 1 ~ 100 for문 이용.

        final int START = 1;
        final int STOP = 100;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN +1;

        int num1 =(int)(Math.random()*range + MIN);;

        for (int i = START; i <= STOP; i++){

            if ( i % num1 == 0){
                System.out.printf("%d에 해당하는 배수 %d\n", num1, i);
            }
        }
    }
}
